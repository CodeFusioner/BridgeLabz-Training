package Junit.src.main.java;

public class BankAccount {
    double balance;
    public void deposit(double a) { balance += a; }
    public void withdraw(double a) {
        if (a > balance) throw new IllegalArgumentException();
        balance -= a;
    }
    double getBalance() { return balance; }
}
