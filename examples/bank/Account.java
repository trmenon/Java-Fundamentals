package core.examples.bank;

public class Account {
    long acc;
    String name;
    double balance;

    public Account(long acc, String name) {
        this.name = name;
        this.acc = acc;
        this.balance = 1000.0;
    }

    public void deposit(double amt) {
        this.balance += amt;
    }

    public void withdraw(double amt) {
        this.balance -= amt;
    }

    public void getAccountDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Account Number: " + this.acc);
        System.out.println("Available Balance: " + this.balance);
    }
}
