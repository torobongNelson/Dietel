package PersonalPractice.HolzPractice;

import java.util.Scanner;

public class MethodC6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        double result = maximum(number1,number2,number3);
        System.out.println("The maximum number is " + result);
    }
    public static double maximum(int x, int y, int z){
        double maximumValue = x;

        if(y > maximumValue) {
             maximumValue = y;
        }
        if(z > maximumValue){
             maximumValue = z;

        }
        return maximumValue;
    }
}