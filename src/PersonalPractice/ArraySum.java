package PersonalPractice;

public class ArraySum {

    //1. **Array Sum:** Write a Java program to calculate the sum of all elements in an integer array.

    public int sumOfArray(int[] theArray){
        int sum = 0;
        for(int index = 0; index < theArray.length; index++){
           sum += theArray[index];
        }
        return sum;
    }

}

