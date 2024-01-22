package PersonalPractice.HolzPractice;

public class AccountC3 {
    private String name;
    private double balance;
    private int password;

    public AccountC3(String name, double balance,int password) {
        this.name = name;
        this.password = password;
        if (balance > 0.0) this.balance = balance;
    }

    public void deposit(double newDeposit) {
        double newBalance;
        if (newDeposit > 0.0) {
            newBalance = balance += newDeposit;
        }

    }

    public void setName() {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setPassword(int password){
        this.password= password;
    }

    public int getPassword() {
        return password;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double withdrawalAmount) {
        double newBalance = 0.00;
        if (withdrawalAmount <= balance) {
            newBalance = balance - withdrawalAmount;
        }

        balance = newBalance;
    }
    public boolean isValidPassword(int myPassword){
       // return myPassword == this.password;
        if(myPassword == this.password ){
            return true;
        }
        return  false;
    }
}
