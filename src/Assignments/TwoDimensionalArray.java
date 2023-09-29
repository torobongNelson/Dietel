package Assignments;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        //char[][] characters = new char[3][3];
//        characters[0][0] = 'x';
//        characters[0][1] = 'o';
//        characters[0][2] = 'x';
//
//        characters[1][0] = 'x';
//        characters[1][1] = 'x';
//        characters[1][2]  = 'o';
//
//
//        characters[2][0]  = 'o';
//        characters[2][1]  = 'x';
//        characters[2][2]  = 'x';


//        System.out.println(Arrays.deepToString(characters));


        char[][] characters = {{'x','o','x'}, {'x','x','o'}, {'o','x','x'}};

        for(int row = 0; row < characters.length; row++){
           for(int col = 0; col < characters.length; col++){
               System.out.print(characters[row][col] + " " );
           }
            System.out.println();
        }

    }
}
