package PersonalPractice;

import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number");
        int number1  = scanner.nextInt();

        System.out.println("enter a number");
        int number2 = scanner.nextInt();

        int sum = number1 + number2;

        System.out.println("this is the sum "  + sum );
    }
}
