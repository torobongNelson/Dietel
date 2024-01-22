package Chapter5;

import java.util.Scanner;

public class SwitchMultipleStatement {
    public static void main(String[] args) {
        int total = 0;
        int gradeCounter = 0;
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("%s%n%s%n %s%n %s%n",
                "Enter the integer grades in the range 0-100.",
                "Type the end-of-file indicator to terminate input:",
                "On UNIX/Linux/macOS type <Ctrl> d then press Enter",
                "On Windows type <Ctrl> z then press Enter");

        while (scanner.hasNext()) {
            int grade = scanner.nextInt();
            total += grade;
            int gradeLevel = grade / 10;

            switch (gradeLevel / 10) {
                case 9:
                case 10:
                    countA++;
                    break;
                case 8:
                    countC++;
                    break;
                case 7:
                    countB++;
                    break;
                case 6:
                    countD++;
                    break;
                default:
                    countF++;
                    break;

            }
        }

        System.out.printf("%nGrade Report:%n");

        double average = 0;
        if (gradeCounter != 0) {
            average = (double) total / gradeCounter;

        } else { // no grades were entered, so output appropriate message
            System.out.println("No grades were entered");
        }
        System.out.printf("Total of the %d grades entered is %d%n",
                gradeCounter, total);
        System.out.println("average:" + average);
    }

}
