package Project.Component;

import Project.Client.PetService;
import Project.Client.Service;
import Project.Main;
import Project.Model.Client;
import Project.Model.Pet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EntityRegister {

    private final PetService petService = new PetService();
    private final Service service= new Service();
    public void registerClient(){
        List<Client> clients =new ArrayList<>();
        String message = "Do you want to add new clients? yes/no";
        do {
            Client client = addClient();
            if (client!=null){
                clients.add(client);
            }

        }while (verifyRepeating(message));
        Map<Client.Location,List<Client>> clientsByLocation = groupClients(clients);
        printClients(clientsByLocation);

    }

    private void printClients(Map<Client.Location, List<Client>> clientsByLocation) {
        for(Map.Entry<Client.Location,List<Client>> clients : clientsByLocation.entrySet()){
            String output ="\nLocation: "+clients.getKey() +
                    "\nClients: (" + clients.getValue().size() + ") "+
                    "\n\t"+ clients.getValue();
            System.out.println(output);

        }
    }

    private Map<Client.Location, List<Client>> groupClients(List<Client> clients) {
        List<Client> fromKyiv = new ArrayList<>();
        List<Client> fromLviv = new ArrayList<>();
        List<Client> fromOdessa = new ArrayList<>();
    for(Client client : clients){
        switch (client.getLocation()){
            case Kyiv -> fromKyiv.add(client);
            case Lviv -> fromLviv.add(client);
            case Odessa -> fromOdessa.add(client);
        }
    }
    Map<Client.Location,List<Client>> clientsByLocation = new HashMap<>();
        clientsByLocation.put(Client.Location.Kyiv,fromKyiv);
        clientsByLocation.put(Client.Location.Lviv,fromLviv);
        clientsByLocation.put(Client.Location.Odessa,fromOdessa);


        return clientsByLocation;
    }

    private Client addClient() {
        Client client = service.registerNewClient();
        if (client != null) {
            registerPet(client);
            System.out.println(client);
        }
        return client;

    }
    private void addPet(Client client) {
        System.out.println("Adding a new Pet. ");
        PetService petService = new PetService();
        Pet pet = petService.RegisterNewPet();
        if(pet!=null) {
            client.addPet(pet);
            pet.setOwner(client.getFirstName() + " " + client.getLastName());
            System.out.println("your pet has been added");
        }

        System.out.println(client);
    }
    private void registerPet (Client client) {
        String message ="Any other Pets? yes/no";
        do {
            addPet(client);
        }while (verifyRepeating(message));
    }
    private boolean verifyRepeating(String message){
        System.out.println(message);
        String answer = Main.scanner.nextLine();
        if ("yes".equals(answer)){
            return true;
        }else if ("no".equals(answer)){
            return false;
        }else {
            System.out.println("incorrect answer, pls try again.");
            return verifyRepeating(message);
        }
    }
}
