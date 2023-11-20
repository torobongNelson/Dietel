package NokiaApp;

import java.util.Scanner;

public class SettingsSecuritySettings {

    Scanner scanner = new Scanner(System.in);

    public void display(){

        System.out.println(" 1. PIN code request");
        System.out.println(" 2. Call barring service");
        System.out.println(" 3. Fixed dialling ");
        System.out.println(" 4. Closed user group");
        System.out.println(" 5. Phone security");
        System.out.println(" 6. Change access code");

        int userInput = scanner.nextInt();

        switch (userInput){
            case 1:
                System.out.println("PIN code request");
            case 2:
                System.out.println("Call barring service");
                break;
            case 3:
                System.out.println("Fixed dialling ");
                break;
            case 4:
                System.out.println("Closed user group");
                break;
            case 5:
                System.out.println(" Phone security");
                break;
            case 6:
             System.out.println(" Change access code");
             break;
        }

    }
}
