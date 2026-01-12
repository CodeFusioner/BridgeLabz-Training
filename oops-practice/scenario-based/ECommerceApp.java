import java.util.*;
class PaymentFailedException extends Exception {
    public PaymentFailedException(String message) {
        super(message);
    }
}
interface Payment {
    void pay(double amount) throws PaymentFailedException;
}
class CardPayment implements Payment {
    public void pay(double amount) throws PaymentFailedException {
        if (amount > 50000)
            throw new PaymentFailedException("Card limit exceeded");
        System.out.println("Paid ₹" + amount + " using Card");
    }
}

class UPIPayment implements Payment {
    public void pay(double amount) throws PaymentFailedException {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class WalletPayment implements Payment {
    public void pay(double amount) throws PaymentFailedException {
        if (amount > 10000)
            throw new PaymentFailedException("Insufficient wallet balance");
        System.out.println("Paid ₹" + amount + " using Wallet");
    }
}


class ProductC {
    int productId;
    String name;
    double price;

    ProductC(int id, String name, double price) {
        this.productId = id;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(productId + " | " + name + " | ₹" + price);
    }
}


class OrderC {
    int orderId;
    ProductC product;
    String status;

    OrderC(int orderId, ProductC product) {
        this.orderId = orderId;
        this.product = product;
        this.status = "Placed";
    }

    void displayOrder() {
        System.out.println("Order ID: " + orderId +
                " | Product: " + product.name +
                " | Status: " + status);
    }
}

// ==========================
// Customer Class
// ==========================
class CustomerC {
    int customerId;
    String name;
    List<OrderC> orders = new ArrayList<>();

    CustomerC(int id, String name) {
        this.customerId = id;
        this.name = name;
    }

    // Place Order
    void placeOrder(ProductC product, Payment payment) {
        try {
            payment.pay(product.price);
            OrderC order = new Order(orders.size() + 1, product);
            orders.add(order);
            System.out.println("Order placed successfully!");
        } catch (PaymentFailedException e) {
            System.out.println("Payment Failed: " + e.getMessage());
        }
    }

    // Cancel Order
    void cancelOrder(int orderId) {
        for (OrderC o : orders) {
            if (o.orderId == orderId) {
                o.status = "Cancelled";
                System.out.println("Order cancelled");
                return;
            }
        }
        System.out.println("Order not found");
    }

    // Track Orders
    void viewOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders found");
            return;
        }
        for (OrderC o : orders) {
            o.displayOrder();
        }
    }
}

// ==========================
// Main Driver Class
// ==========================
public class ECommerceApp {
    public static void main(String[] args) {


        ProductC p1 = new ProductC(1, "Laptop", 60000);
        ProductC p2 = new ProductC(2, "Headphones", 3000);

        // Customer
        CustomerC c1 = new CustomerC(101, "Rahul");

        // Display Products
        p1.display();
        p2.display();

        // Place Orders
        c1.placeOrder(p2, new UPIPayment());
        c1.placeOrder(p1, new CardPayment());

        // View Orders
        c1.viewOrders();

        // Cancel Order
        c1.cancelOrder(1);

        // Track Orders
        c1.viewOrders();
    }
}
