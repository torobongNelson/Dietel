package Chapter2;

import java.util.Scanner;

public class GradeManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int[][] scores = new int[numStudents][numSubjects];

        // Collect scores for each student and each subject
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter scores for Student " + (i + 1) + ":");
            for (int j = 0; j < numSubjects; j++) {
                int score = -1;
                while (score < 0 || score > 100) {
                    System.out.print("Enter score for Subject " + (j + 1) + " (Student " + (i + 1) + "): ");
                    score = scanner.nextInt();
                    if (score < 0 || score > 100) {
                        System.out.println("Score must be between 0 and 100. Please enter a valid score.");
                    }
                }
                scores[i][j] = score;
            }
        }

        displaySummary(scores);
    }

    public static void displaySummary(int[][] scores) {
        System.out.println("========================================================================");
        System.out.printf("%-12s", "STUDENT");
        for (int i = 1; i <= scores[0].length; i++) {
            System.out.printf("%-10s", "SUB" + i);
        }
        System.out.printf("%-10s%-12s%s\n", "TOT", "AVE", "POS");
        System.out.println("========================================================================");

        int[][] studentTotal = new int[scores.length][2];

        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
                System.out.printf("%-12s%-10s", "Student" + (i + 1), scores[i][j]);
            }
            double average = total / (double) scores[i].length;
            System.out.printf("%-10s%-12.2f%s\n", total, average, (i + 1));
            studentTotal[i][0] = total;
            studentTotal[i][1] = i + 1;
        }

        sortAndDisplayByTotal(studentTotal, scores[0].length, scores);
    }

    public static void sortAndDisplayByTotal(int[][] studentTotal, int numSubjects, int[][] scores) {
        for (int i = 0; i < studentTotal.length - 1; i++) {
            for (int j = i + 1; j < studentTotal.length; j++) {
                if (studentTotal[i][0] < studentTotal[j][0]) {
                    int[] temp = studentTotal[i];
                    studentTotal[i] = studentTotal[j];
                    studentTotal[j] = temp;
                }
            }
        }

        System.out.println("========================================================================");
        System.out.printf("%-12s", "STUDENT");
        for (int i = 1; i <= numSubjects; i++) {
            System.out.printf("%-10s", "SUB" + i);
        }
        System.out.printf("%-10s%-12s%s\n", "TOT", "AVE", "POS");
        System.out.println("========================================================================");

        for (int i = 0; i < studentTotal.length; i++) {
            int position = studentTotal[i][1];
            int total = studentTotal[i][0];
            int studentIndex = position - 1;
            double average = total / (double) numSubjects;

            System.out.printf("%-12s", "Student" + position);
            for (int score : scores[studentIndex]) {
                System.out.printf("%-10s", score);
            }
            System.out.printf("%-10s%-12.2f%s\n", total, average, position);
        }
        System.out.println("========================================================================");
    }
}
