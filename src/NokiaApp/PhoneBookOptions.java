package NokiaApp;

import java.util.Scanner;

public class PhoneBookOptions {
    Scanner scanner = new Scanner(System.in);

    public void display(){
        System.out.println("For options:");
        System.out.println("1. Type of view");
        System.out.println( "2. Memory status");

        int userInput = scanner.nextInt();

        switch (userInput){
            case 1:
                System.out.println("Type of view");
                break;
            case 2:
                System.out.println( "2. Memory status");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
