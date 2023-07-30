package arrayBaekJoon3;

class Account {
    private String account;
    private int balance;
    private double interestRate;

    public Account() {//기본 생성자 생성
    }

    public Account(String account, int balance, double interestRate) {
        this.account = account;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public int getBalance() {
        return balance;
    }

    public double calculateInterest() {
        return balance * (interestRate / 100);
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) {
        if (balance >= money) {
            balance -= money;
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}