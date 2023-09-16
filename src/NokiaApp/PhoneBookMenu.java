package NokiaApp;

import java.util.Scanner;

class PhoneBookMenu {
    Scanner scanner = new Scanner(System.in);
    public void display() {
            System.out.println("Phone Book Menu:");
            System.out.println("1. Search");
            System.out.println("2. Service Nos. 1");
            System.out.println("3. Add name");
            System.out.println("4. Erase");
            System.out.println("5. Edit");
            System.out.println("6. Assign tone");
            System.out.println("7. Send b’card");
            System.out.println("8. Options");
            System.out.println("9. Speed dials");
            System.out.println("10. Voice tags");


            int userInput = scanner.nextInt();

            switch (userInput){
                case 1:
                    System.out.println("search");
                 break;
                case 2:
                    System.out.println("Service Nos. 1");
                 break;
                case 3:
                    System.out.println("Add name");
                 break;
                case 4:
                    System.out.println("Erase");
                 break;
                case 5:
                    System.out.println("Edit");
                 break;
                case 6:
                    System.out.println("Assign tone");
                 break;
                case 7:
                    System.out.println("Send b’card");
                    break;
                case 8:
                    PhoneBookOptions phoneBookOptions = new PhoneBookOptions();
                    phoneBookOptions.display();
                    break;
               case 9:
                    System.out.println("Speed dials");
                    break;
               case 10:
                        System.out.println("10. Voice tags");
                    break;
               default:
                    System.out.println("Invalid choice. Please try again.");

            }
    }
}
