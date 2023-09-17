package Assignments;

public class MathematicalOperators {
    public static boolean isEven(int number) {
        if( number % 2 == 0){
            return true;

        }

        return false;
    }

    public static boolean isPrimeNumber(int number ) {
        for (int count = 1; count <= number; count++) {
            if (count % number==0 & count==1|| count==number){
                return true;
            }
        }

        return false;

    }
}
