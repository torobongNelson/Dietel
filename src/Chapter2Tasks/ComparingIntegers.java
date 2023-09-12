package Chapter2Tasks;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter first integer");
        int number = scanner.nextInt();
        int  squareNumber = number * number;
        int sum  = squareNumber + number;
        if (sum>100){
            System.out.println(sum + " is greater than 100.");
        }else{
            System.out.println(sum + " is less than 100");
        }
        if(sum==100) {
            System.out.println(sum + "  is equals to 100");
        }
        if(sum != 100){
            System.out.println(sum + " is not equals to 100");
        }


    }
}
