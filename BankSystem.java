package review;

//Q1: Banking Account Hierarchy
//Scenario:
//In a financial management software for a banking institution, various account types must maintain secure and immutable records of customer details while calculating specific fees based on account features. Design an abstract class BankAccount with private final fields for accountNumber and balance to ensure immutability of core data. Create concrete subclasses SavingsAccount and CheckingAccount. Implement a polymorphic method double calculateFee() that computes transaction fees differently (Savings: 0.5% of balance, Checking: flat 1.0 if balance < 1000). Focus on performance by using primitive types and avoiding unnecessary object creations in calculations.
//
//Sample Input:
//BankAccount savings = new SavingsAccount("12345", 1000.0);
//System.out.printf("%.2f%n", savings.calculateFee());
//Sample Output:
//        5.00
//Test Cases:
//Savings balance 500 → 2.50
//Checking balance 1500 → 0.00
//Checking balance 500 → 1.00

import java.util.ArrayList;
import java.util.List;

interface CalFee{
    double calculateFee();
}

abstract class BankAccount{
    private int accountNumber;
    private int balance;
    public BankAccount(int accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}

class SavingAccount extends BankAccount implements CalFee{

    public SavingAccount(int accountNumber, int balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateFee() {
        return getBalance() * 0.5;
    }
}

class CheckingAccount extends BankAccount implements CalFee{
    public CheckingAccount(int accountNumber, int balance) {
        super(accountNumber, balance);
    }
    public double calculateFee(){
        return getBalance() * 0.8;
    }
}

class BankManagement{
    // crud operations
    List<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount account){
        accounts.add(account);
    }
    public void removeAccount(BankAccount account){
        for(BankAccount acc : accounts){
            if(acc.getAccountNumber() == account.getAccountNumber()){
                accounts.remove(acc);
                return;
            }
        }
    }
    public List<BankAccount> getAccounts() {
        return accounts;
    }
    public BankAccount getAccount(int accountNumber){
        for(BankAccount account : accounts){
            if(account.getAccountNumber() == accountNumber){
                return account;
            }
        }
        return null;
    }
    public void updateAccount(BankAccount oldAccount, BankAccount newAccount){
        for(int i=0; i<accounts.size(); i++){
            if(accounts.get(i).getAccountNumber() == oldAccount.getAccountNumber()){
                accounts.set(i, newAccount);
                return;
            }
        }
    }
    public void displayAccounts() {
        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber() + ", Balance: " + account.getBalance());
        }
    }
}
public class BankSystem {
    public static void main(String[] args) {
        BankAccount savings = new SavingAccount(12345, 1000);
        BankAccount checking1 = new CheckingAccount(67890, 1500);
        BankAccount checking2 = new CheckingAccount(54321, 500);
        BankManagement bankManagement = new BankManagement();
        bankManagement.addAccount(savings);
        bankManagement.addAccount(checking1);
        bankManagement.addAccount(checking2);

        bankManagement.displayAccounts();
        bankManagement.removeAccount(checking2);
        System.out.println("After removing");
        bankManagement.displayAccounts();
        System.out.println("After updating");
        BankAccount newAccount = new CheckingAccount(101, 9000);
        bankManagement.updateAccount(checking1, newAccount);
        bankManagement.displayAccounts();
    }
}
