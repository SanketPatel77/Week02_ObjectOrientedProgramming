// Base class: LibraryBook
class LibraryBook {
    // Attributes
    public String ISBN;            // Public member
    protected String title;        // Protected member
    private String author;         // Private member

    // Constructor
    public LibraryBook(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public methods to set and get the author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass: EBook
class EBook extends LibraryBook {
    private String downloadLink; // Specific attribute for EBooks

    // Constructor
    public EBook(String ISBN, String title, String author, String downloadLink) {
        super(ISBN, title, author); // Call the superclass constructor
        this.downloadLink = downloadLink;
    }

    // Method to display eBook details
    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN); // Access public member
        System.out.println("Title: " + title); // Access protected member
        System.out.println("Download Link: " + downloadLink);
    }
}

// Main class to test the implementation
public class BookLibrarySystem {
    public static void main(String[] args) {
        // Create a LibraryBook object
        LibraryBook book = new LibraryBook("978-3-16-148410-0", "Introduction to Java", "John Doe");
        System.out.println("Library Book Details:");
        book.displayBookDetails();

        // Modify the author
        book.setAuthor("Jane Smith");
        System.out.println("\nUpdated Library Book Details:");
        book.displayBookDetails();

        // Create an EBook object
        EBook eBook = new EBook("978-1-23-456789-0", "Advanced Java Programming", "Alice Johnson", "www.ebooks.com/advanced-java");
        System.out.println("\nEBook Details:");
        eBook.displayEBookDetails();
    }
}
