package Assignments;

import java.util.Scanner;

public class NaturalNumbers {

    Scanner scanner = new Scanner(System.in);

    int count = 0;
  public int sumTenNaturalNumber(){

        int sum=0;

     while (count < 10){
         System.out.println("Enter a number ");
         int value = scanner.nextInt();

         if (value > 0){
             sum += value;
         }else {
            continue;
         }
         count++;

     }
         return  sum;

 }



}
