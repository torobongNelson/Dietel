package ClassTask;

import java.util.Scanner;

public class ClassTskCalculatingStudentScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        double average = 0;
        int counter = 0;
        int sumOfEvenScores = 0;
        double averageOfEvenScores = 0;

        for (int count = 0; count < 10 ; count++) {
            System.out.println("Enter Student's score");
            int score = input.nextInt();
            sum += score;

            if (score % 2 == 0){
                counter++;
                sumOfEvenScores += score;

            }


        }
        average = sum/10;
        averageOfEvenScores = sumOfEvenScores/ counter;

        System.out.println("student average is "+ average);
        System.out.println("sum of student scores is "+ sum);
        System.out.println("sum of student with even scores is "+ sumOfEvenScores);
        System.out.println("average of student with even scores is "+ averageOfEvenScores);

    }
}
