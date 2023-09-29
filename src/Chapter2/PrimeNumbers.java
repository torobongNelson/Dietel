package Chapter2;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number= scanner.nextInt();

        for (int count = 1; count <= number; count++)
            if (count % number==0 & count==1|| count==number){
                System.out.println("It is a prime number");

            }else System.out.println("it is not a prime number.");
        }




    }




