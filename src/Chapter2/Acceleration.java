package Chapter2;

import java.util.Scanner;

public class Acceleration {
    public static void main(String[] args) {


                Scanner input = new Scanner(System.in);
                System.out.println("Enter your initial velocity in m/s: ");
                double initialVelocity = input.nextDouble();

                System.out.println("Enter your final velocity in m/s: ");
                double finalVelocity = input.nextDouble();

                System.out.println("Enter the time taken in seconds: ");
                double timeTaken = input.nextDouble();

                double averageAcceleration=(finalVelocity - initialVelocity)/ timeTaken;
                System.out.println(averageAcceleration);










            }

}
