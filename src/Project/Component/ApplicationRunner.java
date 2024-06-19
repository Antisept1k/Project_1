package Project.Component;

import Project.Client.PetService;
import Project.Client.Service;
import Project.Model.Client;
import Project.Model.Pet;



public class ApplicationRunner {
    private Service service= new Service();
    public void run() {
        if (Authenticator.auth()) {
            Client client = service.registerNewClient();
            if (client != null){
                PetService petService = new PetService();
                Pet pet = petService.RegisterNewPet();
                client.setPet(pet);
                pet.setOwner(client.getFirstName()+" "+ client.getLastName());
                System.out.println("your pet has been added");

            }
        }
    }
}
