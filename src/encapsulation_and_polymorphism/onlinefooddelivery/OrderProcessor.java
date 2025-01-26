package encapsulation_and_polymorphism.onlinefooddelivery;

/**
 * Class to process orders with different food items.
 */
public class OrderProcessor {
    public static void processOrder(FoodItem foodItem) {
        System.out.println(foodItem.getItemDetails());
        System.out.println("Total Price: " + foodItem.calculateTotalPrice());

        // Checking if item is discountable
        if (foodItem instanceof Discountable) {
            Discountable discountable = (Discountable) foodItem;
            discountable.applyDiscount(10); // Applying 10% discount
            System.out.println(discountable.getDiscountDetails());
            System.out.println("Discounted Price: " + foodItem.calculateTotalPrice());
        }

        System.out.println("Order Processed Successfully!\n");
    }
}
