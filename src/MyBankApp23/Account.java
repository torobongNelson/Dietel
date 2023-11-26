package MyBankApp23;

import MyBankApp23.Exceptions.InsufficientFundsException;
import MyBankApp23.Exceptions.InvalidAmmountException;
import MyBankApp23.Exceptions.InvalidPinException;

import java.math.BigDecimal;

public class Account {

    private String accountName;
    private BigDecimal balance = BigDecimal.ZERO;
    private String pin;
    private String accountNumber;
     private BigDecimal amount;




    public Account(String accountNumber, String accountName, String accountPin){
        this.pin           = accountPin;
        this.accountNumber = accountNumber;
        this.accountName   = accountName;
    }

    public Account(String accountName){
        this.accountName = accountName;

    }

    public void deposit(BigDecimal amount){
        balance = balance.add(amount);
    }

    public BigDecimal checkBalance(String pin) {
        if(!pin.equals(this.pin))throw new InvalidPinException("Incorrect pin!");
        return balance;
    }

    public void withdraw(BigDecimal amount, String pin) {
        if(!pin.equals(this.pin))throw new InvalidPinException("Incorrect pin!");

        if(amount.signum() != 1 && amount.remainder(BigDecimal.ONE).compareTo(BigDecimal.ZERO) != 0)
            throw new InvalidAmmountException("Amount must be greater than zero");

        if(amount.compareTo(this.balance) == 1 )  throw new InsufficientFundsException("Insufficient funds");
            // amount > balance = 1
            // amount == balance = 0
            // amount < balance = -1
        balance = balance.subtract(amount);
    }
}
