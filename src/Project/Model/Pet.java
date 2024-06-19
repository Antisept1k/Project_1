package Project.Model;

public class Pet {
    private String type;
    private String sex;
    private int  age;
    private String name;
    private String owner;
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

}
