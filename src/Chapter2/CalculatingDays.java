package Chapter2;

import java.util.Scanner;

    public class CalculatingDays {

        public static void main(String[]  args){

            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number in minutes: " );
            long minutes = input.nextLong();

            int minutesInDay = 24 * 60;
            int minuteInYears = 365 * minutesInDay;
            int years = (int) minutes / minuteInYears;

            int remainingMinutes = (int) minutes % minuteInYears;
            int days = remainingMinutes / minutesInDay;

            System.out.println(minutes  + " minutes is approximately " + years + " years and " + days + " days");

        }


    }

