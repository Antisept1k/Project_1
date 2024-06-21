package Project.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {
    private String FirstName;
    private String LastName;
    private String Email;
    private List<Pet> pets = new ArrayList<>();

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }
    public void setLastName(String lastName){
        this.LastName = lastName;

    }
    public String getFirstName(){
        return FirstName;
    }
    public String getLastName(){
        return LastName;
    }
    public void setEmail(String email){
        this.Email = email;
    }
    public String getEmail(){
        return Email;
    }
    public List<Pet> getPet(){
        return pets;
    }

    public void addPet(Pet pet){
        pets.add(pet);
    }
    public void setPet(List<Pet> pets) {
        this.pets = pets;
    }
    public String toString(){
        return "client {" +
                "\n\t first name ="+ FirstName +
                ", last name ="+ LastName +
                ", email "+Email +
                ",\n\t pets = "+pets+"}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(FirstName, client.FirstName)
                && Objects.equals(LastName, client.LastName)
                && Objects.equals(Email, client.Email)
                && Objects.equals(pets, client.pets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FirstName, LastName, Email, pets);
    }
}

