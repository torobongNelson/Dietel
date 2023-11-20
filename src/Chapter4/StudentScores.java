package Chapter4;

import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {

        Students student = new Students("Nectar",30.0);
        System.out.println(student.getName());
        student.setAverage(50.0);
        System.out.println(student.getAverage());


    }
}
