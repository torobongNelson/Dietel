package PersonalPractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListManipulation {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("paw paw");
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("grape");

        System.out.println(fruits);
        fruits.clear();
        System.out.println(fruits);



    }

}
