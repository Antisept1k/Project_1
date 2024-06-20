package Project.Model;

import java.util.Objects;

public class Dog extends Pet{
    public static final String xS = "XS";
    public static final String S = "S";
    public static final String M = "M";
    public static final String L = "L";
    public static final String xL = "XL";
    public static final String xxL = "XXL";
    private String size;

    public Dog(){}
    public Dog(String size){
        this.size = size;
    }

    public void setSize(String size1) {
        this.size =size1;
    }
    public String getSize(){
        return size;
    }
    @Override
    public String toString(){
        return "Pet = { type: "+ getType() +", sex: "+getSex()+
                ", age: "+getAge()+", name: "+getName()+
                ", size: " +size + ", owner: "+getOwner();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(size, dog.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }
}
