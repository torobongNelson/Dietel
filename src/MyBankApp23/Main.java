package MyBankApp23;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Account praiseAccount = new Account("0042795703","Nelson Ekepenyong", "0000" );

        praiseAccount.deposit(BigDecimal.valueOf(50000));

       System.out.println( praiseAccount.checkBalance("0000") );

        praiseAccount.withdraw(BigDecimal.valueOf(5000), "0000");

        System.out.println( praiseAccount.checkBalance("0000") );
    }
}
