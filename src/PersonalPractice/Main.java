package PersonalPractice;

import Assignments.CreditCardValidator;
import PersonalPractice.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, Kindly Enter Card details to verify: ");

        String verify = scanner.nextLine();

        CreditCardValidator validator = new CreditCardValidator();
         validator.processedCardDetail(verify);
//        System.out.println(validate);
    }






}
