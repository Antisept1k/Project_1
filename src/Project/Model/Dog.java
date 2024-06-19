package Project.Model;

import java.util.Objects;

public class Dog extends Pet{
    private String size;

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
