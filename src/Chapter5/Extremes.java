package Chapter5;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int counter = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        while (scanner.hasNext()){
            System.out.println("Enter a number");
            int userInput = scanner.nextInt();
            if(userInput > max){
                max = userInput;
            }

            if(userInput > min){
               min = userInput;
            }
            counter++;

        }
        System.out.println(max + "is the maximum number");
        System.out.println(min + "is the minimum number");
    }
}
