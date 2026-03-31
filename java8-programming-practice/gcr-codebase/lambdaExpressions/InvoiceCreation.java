package lambdaExpressions;

import java.util.Arrays;
import java.util.List;

class Invoice {
    int transactionId;

    Invoice(int transactionId) {
        this.transactionId = transactionId;
    }

    public String toString() {
        return "Invoice for Transaction ID: " + transactionId;
    }
}


public class InvoiceCreation {
    public static void main(String[] args) {

        List<Integer> transactionIds = Arrays.asList(5001, 5002, 5003);

        transactionIds.stream()
                .map(Invoice::new)
                .forEach(System.out::println);
    }
}
