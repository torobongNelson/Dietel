package Chapter2;

import java.util.Scanner;

 public class Odd{


        public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);

            System.out.print( "Enter a number : ");
            int number = scanner.nextInt();

            if(number %2==0 ){
                System.out.print("this an even number");
            }

            if(number %2 == 1){
                System.out.print("this is a odd number");
            }
            }
        }


