class LibraryBook1 {
    // Attributes
    private String title;
    private String author;
    private double price;

    // Default Constructor
    public LibraryBook1() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized Constructor
    public LibraryBook1(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Display Book Details
    public void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

class BorrowBook {
    // Main method for testing
    public static void main(String[] args) {
        // Using Default Constructor
        LibraryBook1 defaultBook = new LibraryBook1();
        defaultBook.showDetails();

        // Using Parameterized Constructor
        LibraryBook1 paramBook = new LibraryBook1("1984", "George Orwell", 8.99);
        paramBook.showDetails();
    }
}
