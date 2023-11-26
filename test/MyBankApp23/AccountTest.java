package MyBankApp23;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
class AccountTest {
    @Test
    public void testThatWeCanDeposit(){
        Account praiseAccount = new Account("109","Terri","2023");
        praiseAccount.deposit(BigDecimal.valueOf(2000));
        assertEquals(BigDecimal.valueOf(2000), praiseAccount.checkBalance("2023"));
    }
    @Test
    public void testThatWeCanWithdraw(){
        Account praiseAccount = new Account("109","Terri","2023");
        praiseAccount.deposit(BigDecimal.valueOf(2000));
        praiseAccount.withdraw(BigDecimal.valueOf(1000), "2023");

        assertEquals(BigDecimal.valueOf(1000),praiseAccount.checkBalance("2023"));
    }



}