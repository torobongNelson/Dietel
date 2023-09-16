package NokiaApp;

import java.util.Scanner;

public class SettingsPhoneSettings {
    Scanner scanner = new Scanner(System.in);

    public void display(){
        System.out.println("1.Language");
        System.out.println("2. Cell info display");
        System.out.println("3. Welcome note");
        System.out.println("4. Network selection");
        System.out.println("5. Lights");
        System.out.println("6. Confirm SIM service action");

        int userInput = scanner.nextInt();

        switch(userInput){
            case 1:
                System.out.println("Language");
                break;
            case 2:
                System.out.println("Cell info display");
                break;
            case 3:
                System.out.println("Welcome note");
                break;
            case 4:
                System.out.println("Network selection");
                break;
            case 5:
                System.out.println("Lights");
                break;
            case 6:
                System.out.println("Confirm SIM service action");
                break;

        }

    }


}
