package Project.Service;

import Project.Main;
import Project.Model.Cat;
import Project.Model.Dog;
import Project.Model.Pet;

public class PetService {
    public static final String Cat_TYPE = "cat";
    public static final String Dog_TYPE = "dog";

    public Pet RegisterNewPet(){
        Pet pet = null;
        System.out.println("Type (cat/dog): ");
        String type = Main.scanner.nextLine();
        if (Dog_TYPE.equals((type))||Cat_TYPE.equals(type)){
            pet = buildPet(type);
        }else {
            System.out.println("unknown pet type "+ type);
        }
        return pet;
    }

    private Pet buildPet(String type) {

        Pet pet = type.equals(Cat_TYPE) ? new Cat() : new Dog();
        pet.setType(type);
        System.out.println("Sex (male/female): ");
        pet.setSex(Main.scanner.nextLine());

        System.out.println("Name of your pet: ");
        pet.setName(Main.scanner.nextLine());

        System.out.println("Age of your pet : ");
        pet.setAge(Main.scanner.nextInt());
        Main.scanner.nextLine();


        if (type.equals(Dog_TYPE)){
            System.out.println("Your dogs size: (XS/S/M/L/XL/XXl)");
            String size =(Main.scanner.nextLine());
            ((Dog)pet).setSize(Dog.Size.fromString(size));
        }

        return pet;

    }

    }

