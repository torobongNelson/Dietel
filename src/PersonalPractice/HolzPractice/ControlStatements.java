package PersonalPractice.HolzPractice;

import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args) {

//        int product = 3;
//
//        while (product <= 100){
//            product = 3 * product;
//            System.out.println(product);
//        }
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int input = 0;

        while(input <= 2){
            System.out.println("enter the grade ");
            int grade = scanner.nextInt();

             total = total + grade;
            input = input + 1;
        }
        int average = total / 2;

        System.out.println("average is " + average);
         System.out.println("total is " + total );
    }
}
