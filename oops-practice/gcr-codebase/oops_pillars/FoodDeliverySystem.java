package oops_pillars;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemDetails() {
        return itemName + " x" + quantity + " @ " + price;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract double calculateTotalPrice();
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.90;
    }

    public String getDiscountDetails() {
        return "10% discount applied";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50;
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.95;
    }

    public String getDiscountDetails() {
        return "5% discount applied";
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem item = new NonVegItem("Chicken Burger", 200, 2);
        System.out.println(item.getItemDetails());
        System.out.println(item.calculateTotalPrice());
    }
}
