package NokiaApp;

import java.util.Scanner;

public class MessageSettingsCommonMenu {
    Scanner scanner = new Scanner(System.in);

    public void display(){
        int choice;

            System.out.println("Common:"
                    + "1 -> Delivery reports\n"
                    + "2 -> Reply via same centre\n"
                    + "3 -> Character support\n");

            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Delivery reports");
                    break;
                case 2:
                    System.out.println("Reply via same centre");
                    break;
                case 3:
                    System.out.println("Character support");
                    break;
            }
    }
}
