package collectors;

import java.util.*;
import java.util.stream.*;

class Order {
    String customer;
    double total;

    Order(String customer, double total) {
        this.customer = customer;
        this.total = total;
    }

    String getCustomer() { return customer; }
    double getTotal() { return total; }
}

public class OrderRevenueSummary{
    public static void main(String[] args) {

        List<Order> orders = List.of(
                new Order("Kapil", 500),
                new Order("Aman", 300),
                new Order("Kapil", 700)
        );

        Map<String, Double> revenue = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getCustomer,
                        Collectors.summingDouble(Order::getTotal)
                ));

        System.out.println(revenue);
    }
}
