package NokiaApp;

import java.util.Scanner;

public class MessageSettingsMenu {
    Scanner scanner = new Scanner(System.in);
    public void display(){

            System.out.println("Message settings");
            System.out.println("""
                                1. set
                                2. common
                                """);
           int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    MessageSettingsSetMenu MessageSettingsSetMenu = new MessageSettingsSetMenu();
                    MessageSettingsSetMenu.display();
                    break;
                case 2:
                    MessageSettingsCommonMenu MessageSettingsCommonMenu = new MessageSettingsCommonMenu();
                    MessageSettingsCommonMenu.display();
                    break;
            }
    }
}
