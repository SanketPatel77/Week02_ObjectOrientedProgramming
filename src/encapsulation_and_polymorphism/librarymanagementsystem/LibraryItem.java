package encapsulation_and_polymorphism.librarymanagementsystem;

public abstract class LibraryItem {
    // attributes
    private String itemId;
    private String title;
    private String author;

    // constructor
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }


    public abstract int getLoanDuration();  // Abstract method

//    getters
    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
