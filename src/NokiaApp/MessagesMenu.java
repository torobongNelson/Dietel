package NokiaApp;

import java.util.Scanner;

public class MessagesMenu {
    Scanner scanner = new Scanner(System.in);
    public void display(){
        int choice;
            System.out.println("Messages:"
                    + "1 -> Write messages"
                    + "2 -> Inbox"
                    + "3 -> Outbox"
                    + "4 -> Picture messages"
                    + "5 -> Templates"
                    + "6 -> Smileys"
                    + "7 -> Message setting"
                    + "8 -> Info service"
                    + "9 -> Voice mailbox number"
                    + "10 -> Service command editor");

            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Write messages");
                    break;
                case 2:
                    System.out.println("inbox");
                    break;
                case 3:
                    System.out.println("Outbox");
                    break;
                case 4:
                    System.out.println("Picture messages");
                    break;
                case 5:
                    System.out.println("Templates");
                    break;
                case 6:
                    System.out.println("Smileys");
                    break;
                case 7:
                    MessageSettingsMenu MessageSettingsMenu = new MessageSettingsMenu();
                    MessageSettingsMenu.display();
                    break;
                case 8:
                    System.out.println("Info service");
                    break;
                case 9:
                    System.out.println("Voice mailbox number");
                    break;
                case 10:
                    System.out.println("Service command editor");
                    break;
            }

    }
}
