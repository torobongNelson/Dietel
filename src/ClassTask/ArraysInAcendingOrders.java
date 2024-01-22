package ClassTask;

import java.util.Arrays;

public class ArraysInAcendingOrders {


    public static void main(String[] args) {

        int[] myNumbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(ascendingNumbers(myNumbers)));
    }

    public static int[] ascendingNumbers(int[] myNumbers){
        for (int i = 0; i < myNumbers.length; i++){
           myNumbers[i] = myNumbers[i] * myNumbers[i];
        }
        return myNumbers;
    }
}
