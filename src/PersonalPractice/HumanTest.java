package PersonalPractice;

public class HumanTest {
    public static void main(String[] args) {


        Human human = new Human();

        human.setName("stanley");

        human.setHeight(6.5);

        human.setAge(16);

        int humanAge = human.getAge();
        double humanHeight = human.getHeight();
        String humanName = human.getName();



        System.out.printf( "Name: "+ humanName   +  "\n"   +  "Height:"+ humanHeight  + " \n " +   humanAge + " years" );
        System.out.printf(" %n  %d %n  %.2f  %s ", human.getAge() , human.getHeight() , human.getName());
    }



}
