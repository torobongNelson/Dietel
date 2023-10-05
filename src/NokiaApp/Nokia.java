package NokiaApp;

import java.util.Scanner;

public class Nokia {
    Scanner scanner = new Scanner(System.in);

    public void display(){
             System.out.println("Pick a number to choose an action:");
             System.out.println ("1 -----> Phone book");
             System.out.println ("2 -----> Messages");
             System.out.println ("3 -----> Chat");
             System.out.println ("4 -----> Call Register");
             System.out.println ("5 -----> Tones");
             System.out.println ("6 -----> Settings");
             System.out.println ("7 -----> Call Divert");
             System.out.println ("8 -----> Games");
             System.out.println ("9 -----> Calculator");
             System.out.println ("10 -----> Reminders");
             System.out.println ("11 -----> Clock");
             System.out.println ("12 -----> Profiles");
             System.out.println ("13 -----> SIM services");
             System.out.println (": ");

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
                    break;

                case 6:
                    Settings settings = new Settings();
                    settings.display();
                    break;

                case 7:
                    System.out.println("callDivert");
                    break;

                case 8:
                    System.out.println("games");
                    break;

                case 9:
                    System.out.println("Calculator");
                    break;

                case 10:
                    System.out.println("reminder");
                    break;

                case 11:
                    Clock clock = new Clock();
                    clock.display();
                    break;

                case 12:
                    System.out.println("profiles");
                    break;

                case 13:
                    System.out.println("simServices");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");

            }

    }
}
