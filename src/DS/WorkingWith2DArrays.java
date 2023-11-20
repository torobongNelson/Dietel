package DS;

import java.util.Arrays;
import java.util.Scanner;

public class WorkingWith2DArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] board = new String[4][3];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                board[i][j] = "_";


            }

        }
        board[0][0] = "customer 1";  board[0][1] = "2500"; board[0][2] = "1200"; board[0][3] = "800";
        board[1][0] = "customer 2";  board[1][1] = "1150"; board[1][2] = "850";  board[1][3] =  "720";
        board[2][0] = "customer 3";  board[2][1] = "8000"; board[2][2] = "1200"; board[2][3] =  "135";
        board[3][0] = "customer 4";   board[3][1] =  "200"; board[3][2] =  "120"; board[3][3] =  "122";



        System.out.println(Arrays.deepToString(board));


//        char[][] board2 = new char[][]{
//                new char[]{2500},
//                new char[]{3500},
//                new char[]{3500},
//        };
//       System.out.println(Arrays.deepToString(new int));
//


    }

}
