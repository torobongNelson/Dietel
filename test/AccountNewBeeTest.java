import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class AccountNewBeeTest {

    @Test
    public void depositTest(){
        Account  smithAccount = new Account();
        //given that

        //when
        smithAccount.deposit(5000);

        //check
        assertEquals(5000, smithAccount.checkBalance());
    }


    @Test
    public void depositTwoTest(){
        Account smithAccount = new Account();
        //given

        //when
        smithAccount.deposit(2000);
        smithAccount.deposit(5000);
        //check
        assertEquals(7000, smithAccount.checkBalance()) ;
    }

    @Test
    public void withdrawTest(){
        Account smithAccount = new Account();
        //when
        smithAccount.setBalance(2500);
        assertEquals(2500,smithAccount.checkBalance());

        smithAccount.withdraw(1000);
        assertEquals(1500,smithAccount.checkBalance());
    }
    @Test
    public  void depositThreeTest(){
        Account  smithAccount = new Account();
        smithAccount.setBalance(3000);
       assertEquals(3000,smithAccount.checkBalance());
    }


//    @Test
//    public void
//
    }


