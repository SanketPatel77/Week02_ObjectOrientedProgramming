package encapsulation_and_polymorphism.onlinefooddelivery;

/**
 * Interface to provide discount functionality.
 */
public interface Discountable {
    void applyDiscount(double percentage);
    String getDiscountDetails();
}
