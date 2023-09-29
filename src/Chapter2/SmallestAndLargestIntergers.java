package Chapter2;

import java.util.Scanner;

public class SmallestAndLargestIntergers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer");
        int number1 = scanner.nextInt();

        System.out.println("Enter second integer");
        int number2 = scanner.nextInt();

        System.out.println("Enter third integer");
        int number3 = scanner.nextInt();

        int sum = number1 + number3  + number3;
        int average = sum/3;
        int product = number1 * number2 * number3;

        if (number1 > number2 && number1 > number3);
        System.out.println(number1 + "is the largest number");

        if (number2 > number1 && number2 > number3);
        System.out.println(number2 + "is the largest number");

        if (number3 > number1 && number3> number2);
        System.out.println(number2 + "is the largest number");

        if (number1 < number2 && number1 < number3);
        System.out.println(number1 + "is the lowest number");

        if (number2 < number1 && number2 < number3);
        System.out.println(number2 + "is the lowest number");

        if (number3 < number2 && number3 < number1);
        System.out.println(number3 + "is the lowest number");








    }
}
