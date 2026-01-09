package linkedList;

class MovieNode {
    String title, director;
    int year;
    double rating;
    MovieNode next, prev;

    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}

class MovieDoublyLinkedList {
    private MovieNode head, tail;

    public void addAtBeginning(String t, String d, int y, double r) {
        MovieNode node = new MovieNode(t, d, y, r);
        if (head == null) {
            head = tail = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }

    public void addAtEnd(String t, String d, int y, double r) {
        MovieNode node = new MovieNode(t, d, y, r);
        if (tail == null) {
            head = tail = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    public void addAtPosition(int pos, String t, String d, int y, double r) {
        if (pos == 1) {
            addAtBeginning(t, d, y, r);
            return;
        }
        MovieNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) temp = temp.next;
        if (temp == null || temp.next == null) {
            addAtEnd(t, d, y, r);
            return;
        }
        MovieNode node = new MovieNode(t, d, y, r);
        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;
    }

    public void removeByTitle(String title) {
        MovieNode temp = head;
        while (temp != null && !temp.title.equalsIgnoreCase(title))
            temp = temp.next;

        if (temp == null) return;

        if (temp == head) head = temp.next;
        if (temp == tail) tail = temp.prev;

        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
    }

    public void searchByDirector(String director) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director))
                print(temp);
            temp = temp.next;
        }
    }

    public void searchByRating(double rating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.rating >= rating)
                print(temp);
            temp = temp.next;
        }
    }

    public void updateRating(String title, double newRating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
    }

    public void displayForward() {
        MovieNode temp = head;
        while (temp != null) {
            print(temp);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        MovieNode temp = tail;
        while (temp != null) {
            print(temp);
            temp = temp.prev;
        }
    }

    private void print(MovieNode m) {
        System.out.println(m.title + " | " + m.director + " | " + m.year + " | " + m.rating);
    }
}

public class MovieManagementApp {
    public static void main(String[] args) {
        MovieDoublyLinkedList movies = new MovieDoublyLinkedList();

        movies.addAtEnd("Inception", "Nolan", 2010, 8.8);
        movies.addAtBeginning("Interstellar", "Nolan", 2014, 8.6);
        movies.addAtPosition(2, "Avatar", "Cameron", 2009, 7.9);

        System.out.println("Forward:");
        movies.displayForward();

        System.out.println("\nReverse:");
        movies.displayReverse();

        movies.updateRating("Avatar", 8.2);
        movies.removeByTitle("Inception");

        System.out.println("\nAfter Updates:");
        movies.displayForward();
    }
}
