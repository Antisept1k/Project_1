package Project.Comparator;

import Project.Model.Dog;

import java.util.Comparator;

public class Dog_comparator implements Comparator<Dog> {

    @Override
    public int compare(Dog dog1, Dog dog2) {
        return Integer.compare(convertSize(dog1.getSize()), convertSize(dog2.getSize()));
    }
    private  static int convertSize(String size){
        return switch (size){
        case Dog.xS -> 1;
        case Dog.S -> 2;
        case Dog.M -> 3;
        case Dog.L -> 4;
        case Dog.xL -> 5;
        case Dog.xxL -> 6;
            default -> 0;
    };
}
}
