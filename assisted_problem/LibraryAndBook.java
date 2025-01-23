import java.util.ArrayList;

class Book {

    // variables
    private String title;
    private String author;

    // default constructor
    public Book() {
        this.title = "Not available";
        this.author = "unknown user";
    }

    // parameterized constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // setters and getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class Library {
    // Array list to store books
    ArrayList<Book> bookList = new ArrayList<Book>();
    Book obj = new Book();

    // Method to add book object in arraylist
    public void add(Book b) {
        bookList.add(b);
    }

    // Method to display books in library
    public void displayBooks() {
        System.out.println("Books in library");
        for (Book book : bookList) {
            System.out.println("Title :" + book.getTitle() + ", " + "Author :" + book.getAuthor());
        }
    }
}

public class LibraryAndBook {
    // main method
    public static void main(String[] args) {
        // create library objects
        Library library = new Library();

        // create book object and assign values
        Book book1 = new Book("Clean Code", "Robert C. Martin");
        Book book2 = new Book("Code Complete", "Steve McConnell");
        Book book3 = new Book("Think Like a Programmer", "Robert C. Martin");
        Book book4 = new Book("The art of Computer Programmer", "Donald Knuth");

        // adding book object to list of book
        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);

        // display book's title and author name by user defined method
        library.displayBooks();
    }
}
