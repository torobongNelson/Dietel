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


        }

    }
}
