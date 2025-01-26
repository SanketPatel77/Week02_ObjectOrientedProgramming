package encapsulation_and_polymorphism.onlinefooddelivery;

/**
 * Class representing a vegetarian food item.
 */
public class VegItem extends FoodItem implements Discountable {
    private double discount = 0.0;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Overriding abstract method to calculate total price
    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        return total - (total * discount / 100);
    }

    // Implementing Discountable methods
    @Override
    public void applyDiscount(double percentage) {
        this.discount = percentage;
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Item Discount: " + discount + "% applied.";
    }
}
