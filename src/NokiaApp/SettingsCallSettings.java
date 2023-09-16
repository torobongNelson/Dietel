package NokiaApp;

import java.util.Scanner;

public class SettingsCallSettings {
    Scanner scanner = new Scanner(System.in);

    public void display(){
        System.out.println("1. Automatic redial");
        System.out.println("2. Speed dialling");
        System.out.println("3. Call waiting option");
        System.out.println("4. Own number sending");
        System.out.println("5. Phone line in use");
        System.out.println("6. Automatic answer");

        int userInput = scanner.nextInt();

        switch (userInput){
            case 1:
               System.out.println(" Automatic redial");
               break;
            case 2:
                System.out.println(" Speed dialling");
                break;
            case 3:
               System.out.println("Call waiting option");
               break;
            case 4:
               System.out.println("Own number sending");
               break;
            case 5:
               System.out.println("Phone line in use");
               break;
            case 6:
               System.out.println("Automatic answer");
               break;
            default:
               System.out.println("Invalid option choosen");
               break;
        }
    }
}
