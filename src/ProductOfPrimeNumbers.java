import java.util.ArrayList;
import java.util.Arrays;

public class ProductOfPrimeNumbers {

    public static int[] primeFactors(int n) {
        int[] factors = new int[n];
        int factorIndex = 0;
        int divisor = 2;

        while (n > 1) {
            if (n % divisor == 0) {
                factors[factorIndex] = divisor;
                factorIndex++;
                n = n / divisor;
            } else {
                divisor++;
            }
        }

        int[] result = new int[factorIndex];
        System.arraycopy(factors, 0, result, 0, factorIndex);

        return result;
    }

    public static void main(String[] args) {
        int number = 36;
        int[] result = primeFactors(number);

        System.out.println("Prime factors of " + number + " are: " + Arrays.toString(result));
    }
}
