package tdd;

import java.util.Scanner;

public class Square{


        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number");

            int number1 = input.nextInt();
            int number2 = number1 * number1;

            System.out.print("The square of " +  number1  + " is "  + number2 );

        }
    }




