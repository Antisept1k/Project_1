package Project.Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public abstract class Pet {
    public static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
    private String type;
    private String sex;
    private int  age;
    private String name;
    private String owner;
    private final LocalDateTime registrationDate = LocalDateTime.now();
    public void setType(String type1){
        this.type = type1;
    }
    public void setSex(String sex1){
        this.sex = sex1;
    }
    public void setAge(int age1){
        this.age = age1;
    }
    public  void setName(String name1){
        this.name = name1;
    }
    public  void setOwner(String owner1){
        this.owner = owner1;
    }
    public String getType(){
       return type;
    }
    public Integer getAge(){
       return age;
    }
    public String getName(){
       return name;
    }
    public String getSex(){
       return sex;
    }
    public String getOwner(){
       return owner;
    }
    public LocalDateTime getRegistrationDate(){
        return registrationDate;
    }
    public String toString(){
        return "Pet = { type: "+ type +", sex: "+sex+", age: "+age+
                ", name: "+name+ ", owner: "+owner +", registration time: "+registrationDate.format(formatter);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && Objects.equals(type, pet.type)
                && Objects.equals(sex, pet.sex)
                && Objects.equals(name, pet.name)
                && Objects.equals(owner, pet.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, sex, age, name, owner);
    }
}
