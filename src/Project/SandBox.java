package Project;

import Project.Comparator.Dog_comparator;
import Project.Model.Dog;

import java.util.Arrays;
import java.util.Comparator;

public class SandBox {
    public static void main (String[] args){
        Dog[] dogs = {
                new Dog(Dog.xS),
                new Dog(Dog.L),
                new Dog(Dog.M),

                new Dog(Dog.xL),
                new Dog(Dog.S)
        };

        Arrays.sort(dogs, new Dog_comparator()); {
            for (Dog dog : dogs){
                System.out.println(dog.getSize());
            }
        };
    }
}
