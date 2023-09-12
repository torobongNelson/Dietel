package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountHTest {
@Test
public static void main(String[] args) {

    AccountH rexAccount = new AccountH();

    rexAccount.deposit(11000);
    rexAccount.withdraw(12000);
    int balance = rexAccount.checkBalance();
    System.out.print(balance);

}
}