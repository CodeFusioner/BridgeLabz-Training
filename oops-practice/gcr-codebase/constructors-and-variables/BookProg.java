public class BookProg {
    String title;
    String author;
    double price;
    // Default constructor
    BookProg() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }
    // Parameterized constructor
    BookProg(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
        BookProg b1 = new BookProg();
        BookProg b2 = new BookProg("2 States", "Chetan Bhagat", 500);
        b1.display();
        b2.display();
    }
}
