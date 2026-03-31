package inheritance;

class Order {
    String orderIdVar;
    String orderDateVar;

    Order(String givenOrderId, String givenOrderDate) {
        orderIdVar = givenOrderId;
        orderDateVar = givenOrderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumberVar;

    ShippedOrder(String givenOrderId, String givenOrderDate, String givenTrackingNumber) {
        super(givenOrderId, givenOrderDate);
        trackingNumberVar = givenTrackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order Shipped | Tracking: " + trackingNumberVar;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDateVar;

    DeliveredOrder(String givenOrderId, String givenOrderDate, String givenTrackingNumber, String givenDeliveryDate) {
        super(givenOrderId, givenOrderDate, givenTrackingNumber);
        deliveryDateVar = givenDeliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered on: " + deliveryDateVar;
    }
}

public class OrderTest {
    public static void main(String[] args) {

        Order objPlaced = new Order("ORD101", "01-01-2026");
        ShippedOrder objShipped = new ShippedOrder("ORD102", "02-01-2026", "TRK78945");
        DeliveredOrder objDelivered = new DeliveredOrder("ORD103", "03-01-2026", "TRK99900", "05-01-2026");

        System.out.println(objPlaced.getOrderStatus());
        System.out.println(objShipped.getOrderStatus());
        System.out.println(objDelivered.getOrderStatus());
    }
}
