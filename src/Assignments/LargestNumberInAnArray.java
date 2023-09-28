package Assignments;

public class LargestNumberInAnArray {
    public static void main(String[] args) {

        int[] numbers = {5, 10, 15, 20, 25, 35, 45, 50};
        int largestNumber = numbers[0];

        // Iterate through the array to find the largest number
        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > largestNumber) {
                largestNumber = numbers[i];

                System.out.println("The largest number in the array is");


            }
        }
    }
}