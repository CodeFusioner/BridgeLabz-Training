import java.util.*;

class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

abstract class Account {
    String id;
    double balance;
    List<String> history = new ArrayList<>();

    public Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    abstract double calculateInterest();

    public void deposit(double amt) {
        balance += amt;
        history.add("Deposited: " + amt);
    }

    public void withdraw(double amt) {
        if (balance < amt) throw new InsufficientBalanceException("Not enough balance");
        balance -= amt;
        history.add("Withdrawn: " + amt);
    }

    public void transfer(Account to, double amt) {
        if (balance < amt) throw new InsufficientBalanceException("Not enough balance");
        balance -= amt;
        to.balance += amt;
        history.add("Transferred: " + amt + " to " + to.id);
        to.history.add("Received: " + amt + " from " + id);
    }

    public double getBalance() {
        return balance;
    }

    public List<String> getHistory() {
        return history;
    }
}

class SavingAccount extends Account {
    public SavingAccount(String id, double balance) {
        super(id, balance);
    }

    double calculateInterest() {
        return balance * 0.04;
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(String id, double balance) {
        super(id, balance);
    }

    double calculateInterest() {
        return balance * 0.02;
    }
}

interface BankService {
    void createAccount(Account account);
    void transfer(String from, String to, double amt);
    double checkBalance(String id);
    List<String> getHistory(String id);
}

class BankServiceImpl implements BankService {
    Map<String, Account> accounts = new HashMap<>();

    public void createAccount(Account account) {
        accounts.put(account.id, account);
    }

    public void transfer(String from, String to, double amt) {
        Account a = accounts.get(from);
        Account b = accounts.get(to);
        a.transfer(b, amt);
    }

    public double checkBalance(String id) {
        return accounts.get(id).getBalance();
    }

    public List<String> getHistory(String id) {
        return accounts.get(id).getHistory();
    }
}

public class BankingApp {
    public static void main(String[] args) {
        BankServiceImpl bank = new BankServiceImpl();

        Account a1 = new SavingAccount("A1", 1000);
        Account a2 = new CurrentAccount("A2", 500);

        bank.createAccount(a1);
        bank.createAccount(a2);

        bank.transfer("A1", "A2", 200);
        bank.transfer("A1", "A2", 300);

        System.out.println("Balance A1: " + bank.checkBalance("A1"));
        System.out.println("Balance A2: " + bank.checkBalance("A2"));
        System.out.println(bank.getHistory("A1"));
    }
}
