package ClassTask;
public class NumbersShuffling {

    public static int[] shufflingNumbers(int[] myNumbers) {

        int evenIndex = 0;
        for(int oddIndex = 1; oddIndex<myNumbers.length; oddIndex+=2){
            int temp = myNumbers[evenIndex];
            myNumbers[evenIndex] = myNumbers[oddIndex];
            myNumbers[oddIndex] = temp;
            evenIndex += 2;
        }
        return myNumbers;

    }
}
