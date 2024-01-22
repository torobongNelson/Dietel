package PersonalPractice.HolzPractice;

import java.util.Scanner;

public class AccountC3Test {
    public static void main(String[] args) {
        AccountC3 account1 = new AccountC3("Bibi", 5.00,0043);
        AccountC3 account2 = new AccountC3("Steve", 0.00,0043);
        AccountC3 account3 = new AccountC3("Sandy", 6.0000,0040);

//        System.out.println(account1.getBalance(),account1.getName());
//        System.out.println(account1.getName());
//        System.out.println(account2.getBalance());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter deposit for " + account1.getName());
         double firstDeposit = scanner.nextDouble();

        account1.deposit(firstDeposit);

        System.out.println( account1.getBalance());

    }
}
