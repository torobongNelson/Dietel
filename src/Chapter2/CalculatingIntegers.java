package Chapter2;

import java.util.Scanner;

public class CalculatingIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter first integer:");
        int number1 = scanner.nextInt();

        System.out.println("enter second integer:");
        int number2 = scanner.nextInt();

        int squareNumber1 = number1 * number1;
        int squareNumber2 = number2 * number2;

        int sumOfSquares = number1 + number2;

        int differenceOfSquares = number1 - number2;


        System.out.println("The square of first number is " + squareNumber1);
        System.out.println("The square of first number" + squareNumber2);

        System.out.println("The sum of first number is " + squareNumber1);
        System.out.println("The sum of first number is " + squareNumber2);

        System.out.println("The difference of the number squares is: " + differenceOfSquares);
    }





    }
