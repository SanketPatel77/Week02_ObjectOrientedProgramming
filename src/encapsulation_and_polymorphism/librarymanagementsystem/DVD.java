package encapsulation_and_polymorphism.librarymanagementsystem;


public class DVD extends LibraryItem implements Reservable {
    // attributes
    private boolean isAvailable = true;
    private String reservedBy;

//    constructor
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3;  // DVDs can be borrowed for 3 days
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
