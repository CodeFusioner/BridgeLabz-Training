import java.util.*;
class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String msg) {
        super(msg);
    }
}

class Notebook {
    String title, author;
    boolean available = true;

    public Notebook(String t, String a) {
        title = t;
        author = a;
    }

    public String toString() {
        return title + " by " + author + " [" + (available ? "Available" : "Checked Out") + "]";
    }
}

class Library {
    Notebook[] books;
    List<Notebook> list;

    public Library(Notebook[] books) {
        this.books = books;
        list = new ArrayList<>(Arrays.asList(books));
    }

    Notebook search(String partial) {
        for (Notebook b : list)
            if (b.title.toLowerCase().contains(partial.toLowerCase()))
                return b;
        return null;
    }

    void checkout(String title) throws BookNotAvailableException {
        Notebook b = search(title);
        if (b == null || !b.available)
            throw new BookNotAvailableException("Book not available!");
        b.available = false;
    }

    void display() {
        list.forEach(System.out::println);
    }
}

public class LibraryMain {
    public static void main(String[] args) throws Exception {
        Notebook[] arr = {
                new Notebook("Java Programming","James"),
                new Notebook("Data Structures","Robert")
        };

        Library lib = new Library(arr);
        lib.display();
        lib.checkout("Java");
        lib.display();
    }
}
