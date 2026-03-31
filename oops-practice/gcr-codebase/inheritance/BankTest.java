package inheritance;

class BankAccount {
    String accountNumberVar;
    double accountBalanceVar;

    BankAccount(String givenAccNumber, double givenBalance) {
        accountNumberVar = givenAccNumber;
        accountBalanceVar = givenBalance;
    }

    void displayCommonInfo() {
        System.out.println("Account Number: " + accountNumberVar);
        System.out.println("Balance: " + accountBalanceVar);
    }
}

class SavingsAccount extends BankAccount {
    double savingsInterestRateVar;

    SavingsAccount(String accNumber, double balance, double interestRate) {
        super(accNumber, balance);
        savingsInterestRateVar = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + savingsInterestRateVar + "%");
    }
}

class CheckingAccount extends BankAccount {
    double checkingWithdrawalLimitVar;

    CheckingAccount(String accNumber, double balance, double withdrawalLimit) {
        super(accNumber, balance);
        checkingWithdrawalLimitVar = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: " + checkingWithdrawalLimitVar);
    }
}

class FixedDepositAccount extends BankAccount {
    int fdLockPeriodMonthsVar;

    FixedDepositAccount(String accNumber, double balance, int lockPeriodMonths) {
        super(accNumber, balance);
        fdLockPeriodMonthsVar = lockPeriodMonths;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Lock-in Period (months): " + fdLockPeriodMonthsVar);
    }
}

public class BankTest {
    public static void main(String[] args) {

        SavingsAccount objSavings =
                new SavingsAccount("ACC101", 20000.0, 6.5);

        CheckingAccount objChecking =
                new CheckingAccount("ACC102", 15000.0, 10000.0);

        FixedDepositAccount objFD =
                new FixedDepositAccount("ACC103", 50000.0, 24);

        objSavings.displayCommonInfo();
        objSavings.displayAccountType();

        System.out.println();

        objChecking.displayCommonInfo();
        objChecking.displayAccountType();

        System.out.println();

        objFD.displayCommonInfo();
        objFD.displayAccountType();
    }
}
