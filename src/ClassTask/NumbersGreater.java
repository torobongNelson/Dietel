package ClassTask;

import java.util.Arrays;

public class NumbersGreater {
    public static void main(String[] args) {

        int numbers[] = new int[]{1,2,3,3,4,5,2,6};

        int[]  duplicate = new int[numbers.length] ;
        duplicate[2] = numbers[3];
        duplicate[5] = numbers[6];

        System.out.println(Arrays.toString(duplicate));


    }

}
