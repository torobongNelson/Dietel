import java.util.Scanner;

public class ClassTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Enter day of the week");
            int daysOfTheWeek = scanner.nextInt();

        while (daysOfTheWeek > 6) {
            System.out.println("Enter a week day between 0 and 6");
          daysOfTheWeek = scanner.nextInt();

        }
            switch (daysOfTheWeek) {
                case 0:
                    System.out.println("sunday");
                    break;
                case 1:
                    System.out.println("monday");
                    break;
                case 2:
                    System.out.println("tuesday");
                    break;
                case 3:
                    System.out.println("wednesday");
                    break;
                case 4:
                    System.out.println("thursday");
                    break;
                case 5:
                    System.out.println("friday");
                    break;
                case 6:
                    System.out.println("saturday");
                    break;
            }
        }
    }

