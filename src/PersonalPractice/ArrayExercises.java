package PersonalPractice;

public class ArrayExercises {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5};
        ArraySum arraySum = new ArraySum();
       int result = arraySum.sumOfArray(numbers);
        System.out.println(result);
    }
}
