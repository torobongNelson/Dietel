package PersonalPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddNumbers {
    public static void main(String[] args) {

        int[] myNumbers = {1, 2, 3,4,5,6,7};
        System.out.println(Arrays.toString(numbers(myNumbers)));


    }

    public static int[] numbers(int[] myNumbers) {
        ArrayList<Integer> newArray = new ArrayList<>();
        int[] result = new int[myNumbers.length];

        int i;
        for (i = 0; i < myNumbers.length; i++) {
            if (i % 2 == 1) {
                newArray.add (myNumbers[i]);
            }
        }
        int[] newNumbers = new int[newArray.size()];
        for (i = 0; i < newArray.size(); i++) {
            newNumbers[i] = newArray.get(i);
        }

        return newNumbers;

    }
}

