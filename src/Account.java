public class Account {

    private int balance;

    public void setBalance(int balance){
        this.balance = balance;
    }

    public void deposit(int money) {
        balance = balance + money;
    }

    public int checkBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }
}

