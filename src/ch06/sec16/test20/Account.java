package ch06.sec16.test20;

public class Account {
    private String accountNum;
    private String accountName;
    private int balance;

    public Account(String accountNum, String accountName, int balance) {
        this.accountNum = accountNum;
        this.accountName = accountName;
        this.balance = balance;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
