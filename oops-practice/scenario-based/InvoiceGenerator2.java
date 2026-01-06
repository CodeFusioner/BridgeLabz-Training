class InvalidInvoiceFormatException extends Exception {
    InvalidInvoiceFormatException(String message) {
        super(message);
    }
}
public class InvoiceGenerator2 {
    public static String[] parseInvoice(String input) throws InvalidInvoiceFormatException {
        if (!input.contains("-")) {
            throw new InvalidInvoiceFormatException("Invoice must contain '-' between task and amount");
        }
        return input.split(", ");
    }
    public static int getTotalAmount(String[] tasks) throws InvalidInvoiceFormatException {
        int total = 0;
        for (String task : tasks) {
            if (!task.contains("-")) {
                throw new InvalidInvoiceFormatException("Invalid task entry: " + task);
            }
            String[] parts = task.split(" - ");
            if (parts.length < 2) {
                throw new InvalidInvoiceFormatException("Missing amount in: " + task);
            }
            String pricePart = parts[1].split(" ")[0];  // extract 3000
            total += Integer.parseInt(pricePart);
        }
        return total;
    }
    public static void main(String[] args) {
        String input = "Logo Design - 3000 INR, Web Page - 4500 INR";
        try {
            String[] tasks = parseInvoice(input);
            System.out.println("Invoice Items:");
            for (String t : tasks) System.out.println(t);
            int total = getTotalAmount(tasks);
            System.out.println("\nTotal: " + total + " INR");
        } catch (InvalidInvoiceFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
