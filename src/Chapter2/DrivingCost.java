package Chapter2;

import java.util.Scanner;

public class DrivingCost {
        public static void main(String[]  args){
            Scanner scanner  =  new Scanner(System.in);

            System.out.println("Enter the driving distance:");
            double distance = scanner.nextDouble();

            System.out.println("Enter miles per gallon:");
            double milesPerGalon = scanner.nextDouble();

            System.out.println("Enter price per gallon:");
            double drivingCost = scanner.nextDouble();

            double cost =  distance / milesPerGalon * drivingCost;
            String formattedCost = String.format("%.2f",  cost);
            System.out.println("The cost of driving is $" +formattedCost );
        }

    }


