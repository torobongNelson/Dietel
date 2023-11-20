package ClassTask;

import java.util.Scanner;

public class ClassTaskAverageOfEvenScores {
    public static void main(String[] args) {
        int sumOfEvenNumbers = 0;
        int counter = 0;
        double average = 0;

        Scanner scanner = new Scanner(System.in);

        for(int index = 0; index < 10; index++){
            System.out.println("Enter student score");
            int scores = scanner.nextInt();

            if(scores % 2 == 0 ){
                counter +=1;
                sumOfEvenNumbers = scores + sumOfEvenNumbers;



            }

        }
        average = sumOfEvenNumbers/counter;
        System.out.println("The average of even numbers is " + average );

    }
}
