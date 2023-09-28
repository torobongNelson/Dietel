package ClassTask;

import java.util.Scanner;

public class ClassTaskAverageScores {

    public static void main(String[] args) {
        int sum = 0;
        int average = 0;
        Scanner scanner = new Scanner(System.in);

            for(int index = 0; index < 10; index ++ ){
            System.out.println("Enter student score: ");
            int score = scanner.nextInt();

            sum = score + sum;

        }

        average = sum/10;
        System.out.println("The average score of student is " + average);
    }
}
