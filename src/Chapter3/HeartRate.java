package Chapter3;

public class HeartRate {
    private String firstName;
    private String LastName;
    private double dateOfBirth;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }




    public void setLastName(String lastName){
        this.LastName = lastName;
    }

    public String getLastName(){
        return this.LastName;
    }


    public void setdateOfBirth(double dateOfBirth){
        this.dateOfBirth = dateOfBirth;

    }


    public double getDateOfBirth() {
        return dateOfBirth;
    }

}
