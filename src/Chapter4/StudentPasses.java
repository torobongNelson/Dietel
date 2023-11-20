package Chapter4;

import java.util.Scanner;

public class StudentPasses {
    public static void main(String[] args) {
        int passes = 0;
        int failures = 0;
        Scanner scanner = new Scanner(System.in);

       for (int studentCounter = 1; studentCounter <=10; studentCounter++) {
           System.out.println("Enter student result: ");
           int result = scanner.nextInt();
           if(result == 1 ){
               passes += 1;

           }else{
               failures += 1;
           }
       }
       System.out.printf("passed: %d%nFailed:%d%n",passes,failures);

       if(passes >= 8){
           System.out.println("Bonus to instructor!");

       }
    }
}
