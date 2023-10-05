package NokiaApp;

import java.util.Scanner;

public class Clock {

    Scanner scanner = new Scanner(System.in);

    public void display(){
        System.out.println("1.Alarm Clock");
        System.out.println("2.Clock settings");
        System.out.println("3.Date settings");
        System.out.println("4.Stop watch");
        System.out.println("5.Countdown time");
        System.out.println("6.Auto update of date and time");



        int selection = scanner.nextInt();

        switch (selection){
            case 1:
                System.out.println("Alarm Clock");
                break;

            case 2:
                System.out.println("clock settings");
                break;

            case 3:
                System.out.println("date settings");
                break;
            case 4:
                System.out.println("stop watch");
                break;
            case 5:
                System.out.println("countdown time");
                break;
            case 6:
                System.out.println("Auto update of date and time");
                break;

        }




    }


}
