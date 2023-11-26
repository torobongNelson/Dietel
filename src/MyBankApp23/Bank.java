package MyBankApp23;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> accounts;

    private String name;

    public Bank(){
        this.accounts = new ArrayList<>();
    }

    public Account createAccount(){
        Account newAccount = new Account(this.name);
        accounts.add(newAccount);
        return newAccount;
    }



}
