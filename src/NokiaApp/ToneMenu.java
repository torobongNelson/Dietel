package NokiaApp;

import java.util.Scanner;

public class ToneMenu {
    Scanner scanner = new Scanner(System.in);

    public  void display(){
        System.out.println("Tones");
        System.out.println("1. Ringing tone");
        System.out.println("2. Ringing volume");
        System.out.println("3. incoming call alert");
        System.out.println("4. Composer");
        System.out.println("5. Message alert tone");
        System.out.println("6. Warning and game tone");
        System.out.println("7. Vibrating alert");
        System.out.println("8. Screen saver");

        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("Ringing tone");
                break;
            case 2:
                System.out.println("Ringing volume");
                break;
            case 3:
                System.out.println("incoming call alert");
                break;
            case 4:
                System.out.println("Composer");
                break;
            case 5:
                System.out.println("Message alert tone");
                break;
            case 6:
                System.out.println("keypad tones");
                break;
            case 7:
                System.out.println("warning and game tones");
                break;
            case 8:
                System.out.println("vibrating alert");
                break;
            case 9:
                System.out.println("Screen saver");
                break;




        }
} }
