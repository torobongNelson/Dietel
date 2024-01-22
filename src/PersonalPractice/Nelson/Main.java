package PersonalPractice.Nelson;

public class Main {

    private String name;
    private int age;



    public  Main(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return  this.age;
    }
    public static void main(String[] args) {
        Main main = new Main("udo",50);
        main.setName("Rachael");
        String name = main.getName();
        System.out.println(name);




    }
}
