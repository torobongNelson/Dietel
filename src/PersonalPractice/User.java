package PersonalPractice;

import com.sun.source.tree.SwitchTree;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                press
                1 -----> English
                2 ----->Yoruba
                3----->Pidgin
                 """);

        int userInput = scanner.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("God job! \n " +
                        "you have been added to the first category we will create your playlist shortly!");
                break;
            case 2:
                System.out.println("ah han! \n" +
                        "o ti wa ni ipele ikeji, a ma ba e se akojopo orin fun e laipey");
                        break;
            case 3:
                System.out.println("eh hen! \n " +
                        "abeg wait smalll ,e no go too tay you go get your  egbedu");
                break;

            default:
                System.out.println("Congratulations, enjoy the upgrade!");
                


        }
    }
}