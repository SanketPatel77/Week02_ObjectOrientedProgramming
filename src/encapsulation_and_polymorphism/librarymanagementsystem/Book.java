package encapsulation_and_polymorphism.librarymanagementsystem;


public class Book extends LibraryItem implements Reservable {
    // attributes
    private boolean isAvailable = true;
    private String reservedBy;

    // constructor
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;  // Books can be borrowed for 14 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            this.reservedBy = borrowerName;
            isAvailable = false;
            System.out.println(getTitle() + " has been reserved by " + borrowerName);
        } else {
            System.out.println(getTitle() + " is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
