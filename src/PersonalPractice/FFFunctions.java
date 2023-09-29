package PersonalPractice;

public class FFFunctions {
    private static String name;

    public void setName(String userName){
        name = userName;
    }
    public String getName(){
        return name;
    }
    public static String names(String surname){
        return name + " "+  surname;
    }


}

