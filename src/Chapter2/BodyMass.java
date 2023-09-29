package Chapter2;


import java.util.Scanner;

    public class BodyMass {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Please Enter Weight In Pounds: ");
            double weight = input.nextDouble();

            System.out.println("Enter Height in Inches:  ");
            double height = input.nextDouble();

            double weightInKilo = weight * 0.45359237;
            System.out.println("Weight in kg: " + weightInKilo);

            double heightInMeters = height * 0.0254;
            System.out.println("Height in meters: " + heightInMeters);

            double newIndex = weightInKilo/ (heightInMeters * heightInMeters);
            System.out.println("BMI: " + newIndex);


}
    }
