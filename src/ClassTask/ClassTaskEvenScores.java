package ClassTask;

import java.util.Scanner;

public class ClassTaskEvenScores {
    public static void main(String[] args) {
        int sumOfEvenNumbers = 0;
        Scanner scanner = new Scanner(System.in);

        for(int index = 0; index < 10; index++){
            System.out.println("Enter student score:");
            int score = scanner.nextInt();


            if(score % 2 == 0 ){
                 sumOfEvenNumbers = sumOfEvenNumbers + score;
                 System.out.println(score);
            }

            System.out.println();
    }
        System.out.println("The total score of the even number is " + sumOfEvenNumbers);

}
}
