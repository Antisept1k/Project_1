package Project.Client;

import Project.Main;
import Project.Model.Pet;

public class PetService {
    public Pet RegisterNewPet(){
        Pet pet = new Pet();
        buildPet();
        return pet;
        }
    private Pet buildPet() {
        Pet pet = new Pet();
        System.out.println("Type (cat/turtle/...): ");
        pet.setType(Main.scanner.nextLine());
        System.out.println("Sex (male/female): ");
        pet.setSex(Main.scanner.nextLine());
        System.out.println("Name of your pet: ");
        pet.setName(Main.scanner.nextLine());
        System.out.println("Age of your pet : ");
        pet.setAge(Main.scanner.nextInt());

        return pet;

    }

    }

