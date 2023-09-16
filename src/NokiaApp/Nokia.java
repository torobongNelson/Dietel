package NokiaApp;

import java.util.Scanner;

public class Nokia {
    Scanner scanner = new Scanner(System.in);

    public void display(){
            System.out.println("Pick a number to choose an action:\n"
                    + "1 -----> Phone book"
                    + "2 -----> Messages"
                    + "3 -----> Chat"
                    + "4 -----> Call Register"
                    + "5 -----> Tones"
                    + "6 -----> Settings"
                    + "7 -----> Call Divert"
                    + "8 -----> Games"
                    + "9 -----> Calculator"
                    + "10 -----> Reminders"
                    + "11 -----> Clock"
                    + "12 -----> Profiles"
                    + "13 -----> SIM services"
                    + ": ");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    PhoneBookMenu phoneBookMenu = new PhoneBookMenu();
                    phoneBookMenu.display();
                    break;
                case 2:
                    MessagesMenu messagesMenu = new MessagesMenu();
                    messagesMenu.display();
                    break;
                case 3:
                    System.out.println("Chat");
                    break;
                case 4:
                    CallRegisterMenu callRegisterMenu = new CallRegisterMenu();
                    callRegisterMenu.display();
                    break;
                case 5:
                    ToneMenu toneMenu = new  ToneMenu();
                    toneMenu.display();
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

    }
}
