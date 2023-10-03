package Assignments;

public class ArraySnacks {
        public int largestNumberInArray(int[] numbers){
     int max = numbers[0];
     for(int index = 0; index < numbers.length; index++){
         if(numbers[index] > max){
              max = numbers[index];
         }

     }
     return max;
 }

         public static void reverseArray(int[] numbers){
            for(int index = numbers.length-1; index >= 0; index --){
                System.out.print(numbers[index] + " ");

            }
        }

        public static boolean doesNumberExistInArray(int[] numbers, int number){
            for(int i : numbers){
                if(i == number){
                    return  true;
                }
            }
            return false;
        }

        public static void printElementsOnOddPositionsInArray(int[] numbers){
            for(int i = 1; i < numbers.length; i += 2){
                System.out.print(numbers[i] + "");

            }

        }

        public static void printElementsOnEvenPositionsInArray(int[] numbers){
            for(int i = 0; i< numbers.length; i+=2){
                System.out.print(numbers[i] + " ");

            }

        }

        public static int computeTheRunningTotalInArray(int[] numbers){
            int sum = 0;
            for(int index = 0; index < numbers.length; index++){
                sum += numbers[index];

            }
            return sum;
        }

        public static boolean IsPalindrome(String str){
            for(int i = 0; i < str.length() / 2; i++){
                if(str.charAt(i) != str.charAt( str.length() - i - 1)){
                    return false;
                }
            }
            return true;
        }

        public static int computeTheSumWithWhileLoop(int[]  numbers ){
            int sum = 0;
            int i = 0;

            while(i < numbers.length){
                sum += numbers[i];
                i ++;
            }
            return sum;

        }

        public static int computeTheSumWithDoWhileLoop(int[] numbers){
            int sum = 0;
            int i = 0;

            do{
                sum += numbers[i];
                i++;


            }while(i < numbers.length);
            return sum;

        }





 }



