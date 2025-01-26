package encapsulation_and_polymorphism.librarymanagementsystem;

public interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}
