package PersonalPractice;

public class ArraySum {

    public static int sumOfArrays(int[] numbers) {
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }

    public static int maximumElementInArray(int[] numbers){
        int max = 0;
        for(int number : numbers){
            if(number > max){
             max = number;
            }
        }
        return max;
    }

    public static int minimumNumberInArray(int[] numbers){
        int min = numbers[numbers.length-1]; //120
        /*
        * 120 < 120 : No [do nothing]
        * 700 < 120: No [do nothing]
        * 500 < 120 No [do nothing]
        * 20 < 120: Yes [put 2 in min] min = 2;
        * 3 < 2: No [do nothing]
        * 4 < 2: No [do nothing]
        * 5 < 2: No [do nothing]
        * return 2
        * */

        for(int number : numbers){
            if(number < min){
                min = number;
            }
        }
        return min;
    }

    public static double average0fArrayElement(int[] numbers){
       int sum = 0;
       double avg = 0;

       for(int number : numbers){
           sum += number;
       }
       avg = (double) sum / numbers.length;
       return avg;
    }

    public static void countOfOddAndEvenNumbersInArray(int[] numbers){
        int oddNumberCount = 0;
        int evenNumberCount = 0;

        for(int number : numbers){
            if(number % 2 == 0){
                evenNumberCount ++;
            }
            else {
                oddNumberCount ++;
            }

        }
        System.out.println("The count of odd number is: " + oddNumberCount + "\n" +
                "The count of even number is: " + evenNumberCount);
    }

    public static int[] reverseNumbersInArray(int[] myArr) {
        int[] reversedArray = new int[myArr.length];
        int left = 0;
        int right = 0;
        while (left < right) {
            int temp = myArr[left];
            myArr[left] = myArr[right];
            myArr[right] = temp;

            left ++;
            right--;
        }
        return myArr;
    }
}



