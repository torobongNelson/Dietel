package PersonalPractice;

public class
Human {
    private double height;
    private  int age;
    private String firstName;
    private String lastName;
    private String fullName;
    private String skinColor;


    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setFullName(String firstName, String lastName){
        this.fullName = firstName + " " + lastName;
    }

    public String getFullName(){
        return this.fullName;
    }

    public void setSkinColor(String color){
        this.skinColor = color;
    }
    public String getSkinColor(){
        return this.skinColor;
    }





}



