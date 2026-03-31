package functionalInterface;


class ProductC implements Cloneable {

    private int id;
    private String name;
    private double price;

    public ProductC(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', price=" + price + "}";
    }
}

public class CloningPrototypeObjects {

    public static void main(String[]args) {

        try {
            ProductC original = new ProductC(101, "Laptop", 75000);
            ProductC cloned = (ProductC) original.clone();

            System.out.println("Original Object: " + original);
            System.out.println("Cloned Object  : " + cloned);

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported");
        }
    }
}
