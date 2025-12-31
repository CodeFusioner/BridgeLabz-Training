public class CircleProg {
    double radius;

    // Default constructor
    CircleProg() {
        this(1.0); // constructor chaining
    }

    // Parameterized constructor
    CircleProg(double r) {
        radius = r;
    }

    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + Math.PI * radius * radius);
    }

    public static void main(String[] args) {
        CircleProg c1 = new CircleProg();
        CircleProg c2 = new CircleProg(2.5);

        c1.display();
        c2.display();
    }
}
