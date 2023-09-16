package NokiaApp;

import java.util.Scanner;

public class CallRegisterMenu { // my CallRegisterMenu constructor
    Scanner scanner = new Scanner(System.in);

    public void display(){
            System.out.println("Call Register:"
                    + "1. Missed calls"
                    + "2. Received calls"
                    + "3. Dialed numbers"
                    + "4. Erase recent call lists"
                    + "5. Show call duration");

           int  choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Missed calls");
                    break;
                case 2:
                    System.out.println("Received calls");
                    break;
                case 3:
                    System.out.println("Dialed numbers");
                    break;
                case 4:
                    System.out.println("Erase recent call lists");
                    break;
                case 5:
                    ShowCallDurationMenu showCallDurationMenu = new ShowCallDurationMenu();
                    showCallDurationMenu.display();
            }
    }
}
