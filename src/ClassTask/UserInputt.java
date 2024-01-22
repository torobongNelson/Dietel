package ClassTask;

import java.util.Scanner;

public class UserInputt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String response = "yes";
        int sum = 0;
        int Count = 0;
        while (!response.equalsIgnoreCase("No")) {
            System.out.println("enter a number");
            int userInput = scanner.nextInt();
            sum = sum + userInput;
            System.out.println("to continue?");
            response = scanner.next();
            Count++;

        }
        System.out.println(sum);
        double avg = (double) sum /Count;
        System.out.println(avg);
        }

    }


