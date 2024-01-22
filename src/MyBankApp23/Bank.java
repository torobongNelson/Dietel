package MyBankApp23;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> accounts;

    private String name;

    public Bank(String name){
        this.accounts = new ArrayList<>();
        this.name = name;
    }

    public Account registerCustomer(String accountName, String accountNumber, String pin){
        Account newAccount = new Account(accountName, accountNumber, pin);
        accounts.add(newAccount);
        return newAccount;
    }

    public List<Account> getRegisteredCustomers(){
        return this.accounts;
    }



}
