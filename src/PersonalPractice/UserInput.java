package PersonalPractice;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int highestNumber = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Enter a number (-1 to terminate): ");
            int number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            if (number > highestNumber) {
                highestNumber = number;
            }
        }

        scanner.close();

        if (highestNumber != Integer.MIN_VALUE) {
            System.out.println("The highest number entered is: " + highestNumber);
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}

