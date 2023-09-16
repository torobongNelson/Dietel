package NokiaApp;

import java.util.Scanner;

public class ShowCallDurationMenu {
    Scanner scanner = new Scanner(System.in);
    public void display(){

            System.out.println("Show call duration:\n"
                    + "1. Last call duration"
                    + "2. All calls’ duration"
                    + "3. Received calls’ duration"
                    + "4. Dialled calls’ duration"
                    + "5. Clear timers"
            );

            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("last call duration");
                    break;
                case 2:
                    System.out.println("All calls duration");
                    break;
                case 3:
                    System.out.println("Received calls duration");
                    break;
                case 4:
                    System.out.println("Dialled calls duration");
                    break;
                case 5:
                    System.out.println("Clear timers");
                    break;



            }
    }
}
