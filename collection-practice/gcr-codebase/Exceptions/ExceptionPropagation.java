package Exception;

public class ExceptionPropagation {

    public static double calculateInterest(double amount, double rate, int years){
        if(amount < 0 || rate < 0){
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive.");
        }
        return (amount / rate) * years;
    }

    public static void main(String[] args) {
        try{
            System.out.println(calculateInterest(100, -1, 10));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
