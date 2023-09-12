package tdd;

import java.util.Scanner;

public class Factors {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();

        int count ;
        int factor=0;
        for (count=1; count <= number; count++){
            if(number%count == 0) factor=factor+1;

        }
        System.out.printf("%d is a factor" ,factor);
    }
}
