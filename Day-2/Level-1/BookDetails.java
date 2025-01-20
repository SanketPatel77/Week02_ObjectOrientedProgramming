class Book {
    // Attributes
    private String title;
    private String author;
    private double price;

    // Default Constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized Constructor
    public Book(String title, String author, double price) {
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
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

class BookDetails{
	// Main method for testing
    public static void main(String[] args) {
        // Using Default Constructor
        Book defaultBook = new Book();
        defaultBook.displayDetails();

        // Using Parameterized Constructor
        Book paramBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        paramBook.displayDetails();
    }
}
