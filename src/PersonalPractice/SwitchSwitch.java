package PersonalPractice;

import java.util.Scanner;

public class SwitchSwitch {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("""
                pick an option to choose your preferred language
                1 -----> English
                2 ----->Yoruba
                3----->Pidgin
                :
                 """);
        int input = scanner.nextInt();
        switch (input){
            case 1:
                System.out.println("Good job! \n" + " you picked English");
                System.out.println("Lonely at the top has been added to your playlist");
                break;
            case 2:
                System.out.println("Wow, you picked Yoruba");
                System.out.println("\"GONGON ASO\" " + "\nWill be added to your playlist.");
               break;
            case 3:
                System.out.println("you do well, you don pick Pidgin");
                System.out.println("e don happen will be added to your to your playlist");
                break;
            default:
                System.out.println("you picked out of range");

        }
        }

    }

