package Exception;

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}

public class BankTransactionSystem {
    int balance;
    public BankTransactionSystem(int balance){
        this.balance = balance;
    }
    public void withdraw(double amount) throws InsufficientBalanceException{
        if(balance < amount){
            throw new InsufficientBalanceException("Insufficient balance");
        }else if(amount < 0){
            throw new IllegalArgumentException("Amount is negative");
        }else{
            balance -= amount;
            System.out.println("Withdrawal successful, new balance: "+ balance);
        }
    }
    public static void main(String[] args) {
        BankTransactionSystem bankTransactionSystem = new BankTransactionSystem(200);
        try{
            bankTransactionSystem.withdraw(-300);
        }catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
