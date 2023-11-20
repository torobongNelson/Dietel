package PersonalPractice.Eu;


public class Person {
    private static int personCounter;

    public Person(){
        personCounter ++;
    }

    public static int numberOfPersons(){
        return personCounter;
    }


}
