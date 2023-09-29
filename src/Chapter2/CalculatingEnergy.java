package Chapter2;

import java.util.Scanner;

public class CalculatingEnergy {

        public static void main(String[] args){

            Scanner input=new Scanner(System.in);
            System.out.println("Enter the amount of water in kg: ");
            double amountOfWater = input.nextDouble();

            System.out.println("Enter the initial temperature of water: ");
            double initialTemperature = input.nextDouble();

            System.out.println("Enter the final temperature of water: ");
            double finalTemperature  = input.nextDouble();

            double energyNeeded = amountOfWater *(finalTemperature-initialTemperature)*4184;
            System.out.println(energyNeeded);


        }




    }

