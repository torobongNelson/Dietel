package tdd;

import org.junit.jupiter.api.Test;

public class AccountH {
    private int balance;

    public void deposit(int amount){

        balance = balance + amount;
    }
    public void withdraw(int amount) {
        if(balance > amount){
          //  balance = "5k";
        }

    }
    public int checkBalance(){
        return balance;
    }


    }

