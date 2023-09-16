package NokiaApp;

import java.util.Scanner;

public class Settings {
    Scanner scanner = new Scanner(System.in);
    public void display(){
        System.out.println("call settings");
        System.out.println("phone settings");
        System.out.println("Security settings");
        System.out.println("Restore factory settings");

        int userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                SettingsCallSettings callSettings = new SettingsCallSettings();
                callSettings.display();
                break;

            case 2:
                SettingsPhoneSettings phoneSettings = new SettingsPhoneSettings();
                phoneSettings.display();
                break;

            case 3:
                SettingsSecuritySettings securitySettings = new SettingsSecuritySettings();
                securitySettings.display();
                break;

            case 4:
                SettingsRestoreFactorySettings restoreSettings = new SettingsRestoreFactorySettings();
                restoreSettings.display();
                break;

            default:
                System.out.println("invalid option choosen");
                break;

        }
    }
}
