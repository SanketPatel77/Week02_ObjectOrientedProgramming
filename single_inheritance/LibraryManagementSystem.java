package single_inheritance;

// class Book (superclass)
class Book {
    // attributes of book class
    private String title;
    private int publicationYear;

    // constructor
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // setter and getter to access attributes
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPublicationYea() {
        return publicationYear;
    }
}

// Author class (subclass extends Book)
class Author extends Book {
    // attributes of book class
    private String name;
    private String bio;

    // constructor
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Method to display info.
    public void displayInfo() {
        System.out.println("Title of book :" + getTitle() + "\nPublication year :" + getPublicationYea()
                + "\nName of Author :" + name + "\nBio :" + bio);
    }
}

// class with main method (entry point)
public class LibraryManagementSystem {
    public static void main(String[] args) {

        // create object of author class
        Author book = new Author("Clean Code", 2008, "Robert C. Martin", "A Handbook of Agile Software Craftmanship");

        // call for display information
        book.displayInfo();

    }
}