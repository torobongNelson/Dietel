import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students you have: ");
        int numberOfStudent = scanner.nextInt();

        System.out.println("How many subject do they offer: ");
        int numberOfSubject = scanner.nextInt();
        System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>" + "\n" + "Saved Successfully!");

        int[][] studentRecord = new int[numberOfStudent][numberOfSubject];

        for (int i = 0; i < numberOfStudent; i++) {
            for (int j = 0; j < numberOfSubject; i++) {
                System.out.println("Entering score of student  " + (i + 1) );
                System.out.println(" ");
                System.out.print("Enter student " + (i + 1) + "score for subject" + (i + 1) + ":");
                studentRecord[i][j] = scanner.nextInt();

            }


        }

    }
}
