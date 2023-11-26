package PersonalPractice.Nelson;

import java.util.*;

public class ArrayListExercises {

    public static void main(String[] args) {
        int[] arr = {2,7,5,3,4,6,1,0,3};
        int target = 8;
        System.out.println(Arrays.toString( twoSumOne(arr, target)  ));

    }

    public static int[] twoSumOne(int[] arr, int target){
        Map<Integer, Integer> visitedNumbers = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int delta = target - arr[i];
            if( visitedNumbers.containsKey(delta)){
                result.add(  visitedNumbers.get(delta));
                result.add(i);
                return new int[] { result.get(0), result.get(1)};
            }
            visitedNumbers.put(arr[i], i);
        }

        return null;
    }

//    public static int[] twoSum(int[] arr, int target){
//        Map<Integer, Integer> visitedNumbers = new HashMap<>();
//
//        for (int i = 0; i < arr.length ; i++) {
//            int delta = target - arr[i];
//
////            if(visitedNumbers.containsKey(delta)){
////                visitedNumbers.get( )
////            }
//        }
//    }
}
