package Assignments;

import java.util.Scanner;

public class Comparism {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int number1 = scanner.nextInt();

            System.out.println("Enter the second number: ");
            int number2 = scanner.nextInt();

            if (number1 == number2){
                System.out.println("0");
            }
            else if(number1 > number2){
                System.out.println("1");
            }
            else if(number2 > number1){
                System.out.println("-1");
            }
        }



}
