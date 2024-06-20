package Project;

import Project.Model.Dog;
import Project.Model.Pet;

import java.util.Arrays;
import java.util.Comparator;

public class SandBox {
    public static void main (String[] args){
        Dog[] dogs = {
                new Dog(Dog.Size.XS),
                new Dog(Dog.Size.L),
                new Dog(Dog.Size.M),

                new Dog(Dog.Size.XL),
                new Dog(Dog.Size.XXL)
        };

        Arrays.sort(dogs, new Comparator<Dog>() {
            @Override
            public int compare(Dog dog, Dog dog1) {
                return dog.getSize().getValue()-dog1.getSize().getValue();
            }
        }); {
            for (Dog dog : dogs){
                System.out.println(dog.getSize());
            }
        }
        System.out.println(new Dog());
    }
}
