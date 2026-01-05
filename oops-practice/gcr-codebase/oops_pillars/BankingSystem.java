package oops_pillars;

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan();
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    public void applyForLoan() {}

    public boolean calculateLoanEligibility() {
        return getBalance() > 5000;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.02;
    }

    public void applyForLoan() {}

    public boolean calculateLoanEligibility() {
        return getBalance() > 10000;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("101", "Kapil", 7000);
        BankAccount acc2 = new CurrentAccount("102", "Amit", 12000);

        System.out.println(acc1.calculateInterest());
        System.out.println(acc2.calculateInterest());
    }
}
