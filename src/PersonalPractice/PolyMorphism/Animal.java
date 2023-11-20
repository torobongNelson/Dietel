package PersonalPractice.PolyMorphism;

public class Animal {

    String color;
    int height;
    int age;

    public Animal(String color,int height,int age){ //AllArgsConstructor
        this.color = color;
        this.age = age;
        this.height = height;
    }

    public Animal(){} //NoArgsConstructor

    public Animal(String color){
        this.color = color;
    }

    public Animal(int age){
        this.age = age;
    }


    public void makeSound(){
        System.out.println("Animal makes sound");
    }
}
