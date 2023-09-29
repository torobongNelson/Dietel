package Chapter2;

import java.util.Scanner;

public class Finance {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Please Enter  balance:");
            double balance = input.nextDouble();

            System.out.println("Please Enter annual percentage interest rate:");
            double percentageInterestRate = input.nextDouble();

            Finance calculator = new Finance();
            double interest = calculator.calculateInterest(balance, percentageInterestRate );

            System.out.println( "The interest is " + interest);

        }

        public double calculateInterest(double balance, double annualInterestRate){
            double interest = balance * ( annualInterestRate / 1200);
            return interest;
        }


    }

