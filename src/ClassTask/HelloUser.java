package ClassTask;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey User Enter your name :");
        String input = scanner.nextLine();
        System.out.println("Hello " + input + " you are welcome!" );
    }
}
