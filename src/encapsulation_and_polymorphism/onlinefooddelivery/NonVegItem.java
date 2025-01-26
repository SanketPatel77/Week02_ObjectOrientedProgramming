package encapsulation_and_polymorphism.onlinefooddelivery;

/**
 * Class representing a non-vegetarian food item.
 */
public class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge = 50.0;  // Additional charge for non-veg items
    private double discount = 0.0;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Overriding abstract method to calculate total price including additional charge
    @Override
    public double calculateTotalPrice() {
        double total = (getPrice() * getQuantity()) + additionalCharge;
        return total - (total * discount / 100);
    }

    // Implementing Discountable methods
    @Override
    public void applyDiscount(double percentage) {
        this.discount = percentage;
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount: " + discount + "% applied.";
    }
}
