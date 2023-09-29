package Chapter2;

import java.util.Scanner;

public class CalculatingProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first integer :");
        int number1 = scanner.nextInt();

        System.out.println("Enter second integer");
        int number2 = scanner.nextInt();

        int product = number1 * number2;
        System.out.printf("The product is: %d", product );


    }

}
