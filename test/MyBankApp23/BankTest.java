package MyBankApp23;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    private Account account;
    private Bank bank;
    @BeforeEach
    void setUp(){
        bank = new Bank("UBA");
        account    = new Account("praise", "2023", "0000");
    }


    @AfterEach
    void tearDown(){
    }

    @Test
    public void testThatAccountCanBeCreated(){
        account = bank.registerCustomer("praise", "2023", "0000");

        assertNotNull(account);
        assertEquals(1, bank.getRegisteredCustomers().size());
        assertTrue(bank.getRegisteredCustomers().contains(account));
    }


    }

