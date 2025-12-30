class Circle {
    double radius;
    double area() {
        return Math.PI * radius * radius;
    }
    double circumference() {
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 2.5;
        System.out.printf("Area of circle: %.4f\n", c.area());
        System.out.printf("Circumference of circle: %.4f\n", c.circumference());
    }
}
