package oops_pillars;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemDetails() {
        return itemId + " - " + title + " by " + author;
    }

    public abstract int getLoanDuration();
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    public Book(String id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }

    public void reserveItem() {}

    public boolean checkAvailability() {
        return true;
    }
}

class Magazine extends LibraryItem implements Reservable {
    public Magazine(String id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 7;
    }

    public void reserveItem() {}

    public boolean checkAvailability() {
        return true;
    }
}
class DVD extends LibraryItem implements Reservable {
    public DVD(String id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 5;
    }

    public void reserveItem() {}

    public boolean checkAvailability() {
        return false;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryItem item = new Book("B01", "DSA", "Narasimha");
        System.out.println(item.getItemDetails());
        System.out.println(item.getLoanDuration());
    }
}
