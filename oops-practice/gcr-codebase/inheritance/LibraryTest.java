package inheritance;

class Book {
    String bookTitleVar;
    int bookPublicationYearVar;

    Book(String givenTitle, int givenYear) {
        bookTitleVar = givenTitle;
        bookPublicationYearVar = givenYear;
    }

    void displayInfo() {
        System.out.println("Book Title: " + bookTitleVar);
        System.out.println("Publication Year: " + bookPublicationYearVar);
    }
}

class Author extends Book {
    String authorNameVar;
    String authorBioVar;

    Author(String givenTitle, int givenYear, String givenAuthorName, String givenBio) {
        super(givenTitle, givenYear);
        authorNameVar = givenAuthorName;
        authorBioVar = givenBio;
    }

    @Override
    void displayInfo() {
        System.out.println("Book Title: " + bookTitleVar);
        System.out.println("Publication Year: " + bookPublicationYearVar);
        System.out.println("Author Name: " + authorNameVar);
        System.out.println("Author Bio: " + authorBioVar);
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        Author objAuthorBook = new Author(
                "Clean Code",
                2008,
                "Robert C. Martin",
                "Software craftsman and author of several programming books."
        );

        objAuthorBook.displayInfo();
    }
}
