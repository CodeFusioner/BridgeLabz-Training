package functionalInterface;

interface PaymentProcessor {

    void pay(double amount);

    default void refund(double amount) {
        System.out.println("Refunding ₹" + amount);
    }
}
class Paytm implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via Paytm");
    }
}


public class PaymentProcessApp {
    public static void main(String[] args) {
        PaymentProcessor processor = new Paytm();
        processor.pay(500);
        processor.refund(200);

    }
}
