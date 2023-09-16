package NokiaApp;

import java.util.Scanner;

public class MessageSettingsSetMenu {
    Scanner scanner = new Scanner(System.in);
    public void display(){
        int choice;

            System.out.println("Set:"
                    + "1 -> Message Center number\n"
                    + "2 -> Messages sent as\n"
                    + "3 -> Message Validity\n");

            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Message Center number");
                    break;
                case 2:
                    System.out.println("Messages sent as");
                    break;
                case 3:
                    System.out.println("Message Validity");
                    break;
            }
    }
}
