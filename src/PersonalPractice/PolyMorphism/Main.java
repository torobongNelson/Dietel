package PersonalPractice.PolyMorphism;

public class Main {
    public static void main(String[] args) {
        Animal billy = new Dog();
        Animal kitty = new Cats();
        Animal bibi = new Birds();

        Animal animal = new Animal();

        billy.makeSound();
    }
}
