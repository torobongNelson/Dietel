package HolzPractice;

import PersonalPractice.HolzPractice.AccountC3;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountC3Test {
    AccountC3 stAccount;
        @BeforeEach
        void setUp(){
         stAccount = new AccountC3("Steve",100.00, 3500);
       }
        @AfterEach
        void tearDown(){}
    @Test
    public void testThatICanGetBalance(){
           assertEquals(100.00,stAccount.getBalance() );
    }
   @Test
   public void testThatICanDeposit(){
            stAccount.deposit(50.00);
            assertEquals(50.00,stAccount.getBalance());
    }
    @Test
    public void testThatICanWithdraw(){
            stAccount.withdraw(50.00);
            assertEquals(50.00,stAccount.getBalance());
    }

    @Test
    public void testAccountName(){
            assertEquals("Steve", stAccount.getName());
    }
        @Test
        public void testAccountPassword(){
            assertTrue(stAccount.isValidPassword(3500));
            assertEquals(3500,stAccount.getPassword());
        }

        @Test
        public void testWrongPassword(){
            assertFalse(stAccount.isValidPassword(6050));
        }

    }




