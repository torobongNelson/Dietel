package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeGame {
    private enum token  {X, O, EMPTY}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                           --> WELCOME!<--
                            Ready To PLAY?
                _______________________________________________
                + Press 1 if you love to be the first player :
                + Press 2 if you love to be the second player :
                _______________________________________________
                """);
        int userResponse = scanner.nextInt();

        switch (userResponse){
            case 1:
                System.out.println("Great,You are the first player!");
                break;

            case 2:
                System.out.println("Awesome! You are the second player!");
        }
            System.out.println("Ready..." + "\n" + 1 + "\n" + 2 + "\n" + "GO!!!");


        System.out.println();

        char[][] boardGame = new char[3][3];
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                boardGame [i][j] = '_';
                System.out.print(boardGame[i][j] + "   "  );

            }

            System.out.println();
        }
        System.out.println("Select a number between 1 - 9 ");

//        if()

    }

}
