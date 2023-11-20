package PersonalPractice;

public class  HumanTest {
    public static void main(String[] args) {


        Human human = new Human();

        human.setFullName("stanley", "Okereke");

        human.setHeight(6.5);

        human.setAge(16);

        int humanAge = human.getAge();
        double humanHeight = human.getHeight();
        String humanName = human.getFullName();



        System.out.printf( "Name: "+ humanName   +  "\n"   +  "Height:"+ humanHeight  + " \n " +   humanAge + " years" );
    }



}
