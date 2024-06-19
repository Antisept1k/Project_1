package Project.Model;

import java.util.Objects;

public class Client {
    private String FirstName;
    private String LastName;
    private String Email;
    private Pet pet;

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
    public Pet getPet(){
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
    public String toString(){
        return "client {" +
                "\n\t first name ="+ FirstName +
                ", last name ="+ LastName +
                ", email "+Email +
                ",\n\t pet = "+pet+"}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(FirstName, client.FirstName)
                && Objects.equals(LastName, client.LastName)
                && Objects.equals(Email, client.Email)
                && Objects.equals(pet, client.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FirstName, LastName, Email, pet);
    }
}

