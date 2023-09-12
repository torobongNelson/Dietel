package Assignments;

import java.util.Scanner;

public class LargestAndSmallestNumbers {

    public static void main(String[] args) {
       int max = 0;
       int min = 0;
        Scanner scanner = new Scanner(System.in);
    while (true) {
        System.out.println("Enter a number");
        int input = scanner.nextInt();


          if (input > max) {
            max = input;
          }

          if(input < min){
            min = input;
          }



        System.out.println("Do you want to continue ?    \n " +
                "press 1 to continue\n" +
                "press 0 to exit!");
        int input2 = scanner.nextInt();

        if (input2 ==0){
            System.out.println("maximum is "+max+" and  minimum is  "+min);
            System.out.println("farewell user");
            break;
        }


    }
    }

}

