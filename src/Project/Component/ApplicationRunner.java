package Project.Component;

import Project.Client.PetService;
import Project.Client.Service;
import Project.Main;
import Project.Model.Client;
import Project.Model.Pet;



public class ApplicationRunner {
    private final PetService petService = new PetService();
    private final Service service= new Service();
    public void run() {
        if (Authenticator.auth()) {
            Client client = service.registerNewClient();
            if (client != null) {
                registerPet(client);
                System.out.println(client);
            }
        }
    }
    private void registerPet (Client client) {
        boolean more_pets = true;
        while (more_pets) {
            addPet(client);
            System.out.println("Any other Pets? yes/no");
            String answer = Main.scanner.nextLine();
            if (answer.equals("no")) {
                more_pets = false;
            }
        }
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
}
