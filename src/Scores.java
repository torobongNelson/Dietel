import java.util.Scanner;


public class Scores {
    // A = 90 to
    //B = 80 to 89
    //C = 70 to 79
    //D= 60 to 69
    //F = less than 60(40)

    public static void main (String args[]){
        System.out.println("Enter a score : ");
        Scanner scanner = new Scanner(System.in);
        int studentScore = scanner.nextInt();

        if( studentScore >= 90  &&  studentScore <= 100)
         System.out.println("A");

        if( studentScore >= 80  &&  studentScore <= 89)
            System.out.println("B");

        if( studentScore >= 70  &&  studentScore <= 79)
            System.out.println("C");

        if( studentScore >= 60  &&  studentScore <= 69)
            System.out.println("D");

        if( studentScore <= 60)
            System.out.println("F");

    }

}
