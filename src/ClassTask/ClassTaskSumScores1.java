package ClassTask;

import java.util.Scanner;

public class ClassTaskSumScores1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

       for(int index = 0; index < 10; index ++){
           System.out.println("Enter a score :");
           int score = scanner.nextInt();

           sum = score + sum;


       }
        System.out.println("The total scores of student is " +  sum);
    }

}
