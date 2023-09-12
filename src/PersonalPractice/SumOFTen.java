package PersonalPractice;

import java.util.Scanner;

public class SumOFTen {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();
       int  count=1;
        int sum = 0;
        while (count < number) {
            sum+= count;
            count= sum + 1;
//            sum+=count;
        }
        System.out.println("The sum is : " + sum);

    }
}