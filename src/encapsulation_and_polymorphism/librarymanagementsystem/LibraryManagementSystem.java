package encapsulation_and_polymorphism.librarymanagementsystem;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // objects of different classes
        LibraryItem book1 = new Book("B101", "Java Programming", "James Gosling");
        LibraryItem magazine1 = new Magazine("M202", "Tech Monthly", "John Doe");
        LibraryItem dvd1 = new DVD("D303", "Inception", "Christopher Nolan");

        System.out.println(book1.getItemDetails());
        System.out.println("Loan duration: " + book1.getLoanDuration() + " days");

        Reservable reservableBook = (Reservable) book1;
        reservableBook.reserveItem("Alice");
        System.out.println("Is available: " + reservableBook.checkAvailability());

        System.out.println(magazine1.getItemDetails());
        System.out.println("Loan duration: " + magazine1.getLoanDuration() + " days");

        Reservable reservableMagazine = (Reservable) magazine1;
        reservableMagazine.reserveItem("Bob");
        System.out.println("Is available: " + reservableMagazine.checkAvailability());

        System.out.println(dvd1.getItemDetails());
        System.out.println("Loan duration: " + dvd1.getLoanDuration() + " days");

        Reservable reservableDVD = (Reservable) dvd1;
        reservableDVD.reserveItem("Charlie");
        System.out.println("Is available: " + reservableDVD.checkAvailability());
    }
}
