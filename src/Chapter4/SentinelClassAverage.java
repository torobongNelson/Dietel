package Chapter4;

import java.util.Scanner;

public class SentinelClassAverage {
    public static void main(String[] args) {
        int total = 0;
        int counter = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first grade : ");
        int grade = scanner.nextInt();

        while (grade != -1 ){
            total = total + grade;
            counter = counter +1;

            System.out.println("Enter the next grade");
             grade = scanner.nextInt();

        }

        if(counter != 0){
            double average = (double) total / counter;
//            System.out.println("This is the average" + average);
            System.out.printf("%nTotal of the %d grades entered is %d%n", counter, total);
            System.out.printf("Class average is %.2f%n", average);
        }else{
            System.out.println("no grades were entered ");
        }





    }
}
