package ch06.sec16.test19;

public class Account {
    private int balance;
    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if ((MIN_BALANCE <= balance) && (balance <= MAX_BALANCE)) {
            // 조건식에 안 맞으면 현재(이전) 값을 유지해야 하고
            // 밖에서도 사용 가능하여야 하니 적립
            this.balance += balance;
        }
    }
}
