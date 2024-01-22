package PersonalPractice;

import java.util.Arrays;

public class ArrayExercises {

    public int SumOfArray(int[] myNumbers){
        int sum = 0;
        for (int i = 0; i < myNumbers.length; i++ ){
            sum += myNumbers[i];
        }

        return sum;
    }

    public int AverageNumberInArray(int[] numbers ){
        int sum = 0;

        for (int i = 0; i< numbers.length; i++){
          sum += numbers[i];
        }
        int average = 0;

        average = sum / numbers.length;

        return average;


    }

    public int MaximumNumberInArray(int[] numbers){
        int max = numbers[0];

        for(int i = 0; i< numbers.length; i++){
            if( numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;


    }




}