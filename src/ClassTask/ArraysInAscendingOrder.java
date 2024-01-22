package ClassTask;

import java.util.Arrays;

public class ArraysInAscendingOrder {
    public static void main(String[] args) {
//        ArraysInAscendingOrder.squareAndSortDescending(numbers);
    }


    public static void squareAndSortDescending(int[] numbers) {
        int[] result = {1,2,3,4,5};

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * numbers[i];
        }

        Arrays.sort(result);
       int[] descendingResult = new int[result.length];

      for (int i = 0; i < result.length; i++) {
            descendingResult[i] = result[result.length - 1 - i];
        }

    }

}
