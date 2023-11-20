package PersonalPractice;

public class FindLargestNumber {

    public static void main(String[] args){
        double[] numbers = {7.00, 3.00, 4.00, 1.00, 45.00, 50.00};

        System.out.println( largestDouble(numbers) );
    }


    public static double largestDouble(double[] fiveDoubles ){
        double max = fiveDoubles[0];
        for (int i = 0; i < fiveDoubles.length; i++){
            if(fiveDoubles[i] > max){
               max = fiveDoubles[i];
            }
        }
        return max;
    }







//max = 7.00

/*
*[0] - 7.00  is 7.00 > 7.00 = false; therefore max is still = 7.00 | 1 + [0] = [1]
*[1] - 3.00   is 3.00 > 7.00   = false; therefore max is still = 7.00 | 1 + [1] = [2]
*[2] - 4.00   is 4.00 > 7.00   = false; therefore max is still = 7.00 | 1 + [2] = [3]
*[3] - 1.00   is 1.00 > 7.00   = false; therefore max is still = 7.00 | 1 + [3] = [4]
*[4] - 45.00  is 4.00 > 7.00   = true; therefore max is        = 45.00 | 1 + [4] = [5]
*[5] - 50.00  is 50.00 > 45.00 = true; therefore max is        = 50.00
* */

}
