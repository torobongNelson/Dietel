import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int base = scanner.nextInt();

        System.out.println("Enter another number:");
        int num = scanner.nextInt();
        int result = 0;

        for (int count= 0; count < num; count++) {
            result = base * num;
        }
        System.out.println("The value of " + base + " raised to the power of " + num + " is: " + result);
    }
}
