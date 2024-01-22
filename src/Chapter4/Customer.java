package Chapter4;

public class Customer {
    private String name;
    private long accountNumber;
    private int beginningOfTheMonthBalance;
    private int totalItemsChargedThisMonth;
    private int  totalCreditsAppliedToCustomer;

    private int  creditLimit;

    public Customer(String name, long accountNumber, int beginningOfTheMonthBalance, int totalItemsChargedThisMonth, int totalCreditsAppliedToCustomer, int creditLimit) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.beginningOfTheMonthBalance = beginningOfTheMonthBalance;
        this.totalItemsChargedThisMonth = totalItemsChargedThisMonth;
        this.totalCreditsAppliedToCustomer = totalCreditsAppliedToCustomer;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBeginningOfTheMonthBalance() {
        return beginningOfTheMonthBalance;
    }

    public void setBeginningOfTheMonthBalance(int beginningOfTheMonthBalance) {
        this.beginningOfTheMonthBalance = beginningOfTheMonthBalance;
    }

    public int getTotalItemsChargedThisMonth() {
        return totalItemsChargedThisMonth;
    }

    public void setTotalItemsChargedThisMonth(int totalItemsChargedThisMonth) {
        this.totalItemsChargedThisMonth = totalItemsChargedThisMonth;
    }

    public int getTotalCreditsAppliedToCustomer() {
        return totalCreditsAppliedToCustomer;
    }

    public void setTotalCreditsAppliedToCustomer(int totalCreditsAppliedToCustomer) {
        this.totalCreditsAppliedToCustomer = totalCreditsAppliedToCustomer;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }


}
