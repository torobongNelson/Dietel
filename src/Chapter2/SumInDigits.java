package Chapter2;

import java.util.Scanner;

  public class SumInDigits {


        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter an integer between 0 an 1000:");
            int number = input.nextInt();

            int sum = 0;
            int temp = number;

            while(temp != 0){
                int digit = temp % 10;
                sum += digit;
                temp /= 10;
            }
            System.out.println("The sum of the digits is " + sum);


        }





    }
