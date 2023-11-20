package Chapter4;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        for (int gradeCounter = 1; gradeCounter <= 10; gradeCounter++){
            System.out.println("Enter a grade : ");
            int grade = scanner.nextInt();
            total += grade;
        }
        double average = total / 10;

        System.out.println("This is the total: " + total);
        System.out.println("This is the class average: " + average);



    }
}
