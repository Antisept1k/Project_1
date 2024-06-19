package Project.Model;

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
}
