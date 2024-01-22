package PersonalPractice.HolzPractice;

public class ArraysC7Frequency {
    public static void main(String[] args) {
//        int[] numbers = {50, 5,3,876,87,765,7,34,3525,825};
//        System.out.printf("%s%5s%n" ,"Numbers" ,  " Value");
////
//        for(int i = 0; i < numbers.length; i++){
//            System.out.printf("%1s%8d%n", i, numbers[i]);

////

        int[] responses =
                {1,2,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2,14};
        int [] frequency = new int[6];

        for(int answer = 0; answer < responses.length; answer++){
            try{
                ++frequency[responses[answer]];
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.printf(" responses[%%d] = %d%n%n ", responses);

            }
        }
        //System.out.printlf(%s%10s&n);


    }
        }






