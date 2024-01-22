package ClassTask;

import java.util.Objects;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response = "Yes";
        int sum = 0;
        int count = 0;
        while (!response.equalsIgnoreCase("No")) {
            System.out.println("Enter a number :");
            int userInput = scanner.nextInt();
            sum = sum + userInput;
            System.out.println("Do you want to continue ?");
            response = scanner.next();
            count++;
        }
        System.out.println(sum);
        double avg = (double) sum /count;
        System.out.println("this is the average " + avg);



    }


    }

