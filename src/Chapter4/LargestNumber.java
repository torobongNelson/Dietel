package Chapter4;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 3;
        int largestNo = 0;
        int secondLargestNo = 0;

        for (int i = 1; i <= score; i++) {

            System.out.println("Enter a number : ");
            int input = scanner.nextInt();

            if (input > largestNo ) {
                largestNo = input;
            }else{
                secondLargestNo = input;
            }

        }
        System.out.println(largestNo + " yay!! you scored the highest");
        System.out.println(secondLargestNo + " yay!! you are the second highest scorer");


    }


}
