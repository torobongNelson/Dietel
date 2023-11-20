package PersonalPractice;

import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String[] args) {
        int[] numbers  =  new int[5];
        numbers[0] = 20;
        numbers[1] = 200;
        numbers[2] = 40;
        numbers[3] = 60;
        numbers[4] = 20;
        //System.out.println(Arrays.toString(numbers));

        int newSize = numbers.length + 3;
        int[] numbers2 = new int[newSize];

        for(int i = 0; i < numbers.length; i++ ){
            numbers2[i] = numbers[i];
        }

        System.out.println(Arrays.toString(numbers2));// [20, 200, 40, 60, 20, 0, 0, 0]

        numbers2[newSize -3] = Integer.parseInt("5");
        numbers2[newSize -2] = 100;
        numbers2[newSize -1] = 300;
        System.out.println(Arrays.toString(numbers2)); // [20, 200, 40, 60, 20, 5, 100, 300]

        int indexToRemove = 2;

        int shrinkSize = numbers2.length -1;
        int[] updatedArray = new int[shrinkSize];

        int j = 0;
        for(int i = 0; i < numbers2.length; i++){
            if(i != indexToRemove){
                updatedArray[j] =  numbers2[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(updatedArray));







    }

}
