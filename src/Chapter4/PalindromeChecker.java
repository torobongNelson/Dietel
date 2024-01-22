package Chapter4;

import java.util.Scanner;

public class PalindromeChecker {




        public static void main(String[] args) {
            // Step 1: Input Validation
            int number = getValidFiveDigitNumber();

            // Step 2: Convert to String
            String numberAsString = Integer.toString(number);

            // Step 3: Check for Palindrome
            boolean isPalindrome = checkPalindrome(numberAsString);

            // Step 4: Display Result
            if (isPalindrome) {
                System.out.println("The number is a palindrome!");
            } else {
                System.out.println("The number is not a palindrome.");
            }
        }

        // Helper method for input validation
        private static int getValidFiveDigitNumber() {
            Scanner scanner = new Scanner(System.in);
            int number;

            do {
                System.out.print("Enter a five-digit integer: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    scanner.next(); // consume the invalid input
                }
                number = scanner.nextInt();
            } while (number < 10000 || number > 99999);

            return number;
        }

        // Helper method to check if a string is a palindrome
        private static boolean checkPalindrome(String str) {
            int length = str.length();
            for (int i = 0; i < length / 2; i++) {
                if (str.charAt(i) != str.charAt(length - 1 - i)) {
                    return false;
                }
            }
            return true;
        }
    }


