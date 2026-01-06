import java.util.*;

public class InvoiceGenerator {
    public static String[] parseInvoice(String input) {
        return input.split(", ");
    }
    public static int getTotalAmount(String[] tasks) {
        int total = 0;
        for (String task : tasks) {
            String[] parts = task.split(" - ");
            String pricePart = parts[1].split(" ")[0];
            total += Integer.parseInt(pricePart);
        }
        return total;
    }
    public static void main(String[] args) {
        String input = "Logo Design - 3000 INR, Web Page - 4500 INR";
        String[] tasks = parseInvoice(input);
        System.out.println("Invoice Details:");
        for (String task : tasks) {
            System.out.println(task);
        }
        int total = getTotalAmount(tasks);
        System.out.println("\nTotal Amount: " + total + " INR");
    }
}
