public class LibraryBookSystem {
    String title;
    String author;
    double price;
    boolean available;

    LibraryBookSystem(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
        available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book not available.");
        }
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + available);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        LibraryBookSystem book = new LibraryBookSystem("Wings of Fire", "A.P.J Abdul Kalam", 450);
        book.display();
        book.borrowBook();
        book.display();
    }
}
