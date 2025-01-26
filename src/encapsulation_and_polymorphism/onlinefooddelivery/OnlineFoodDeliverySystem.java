package encapsulation_and_polymorphism.onlinefooddelivery;

/**
 * Main class to test the Online Food Delivery System.
 */
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        // Creating food items
        FoodItem vegBurger = new VegItem("Veg Burger", 150.0, 2);
        FoodItem chickenPizza = new NonVegItem("Chicken Pizza", 300.0, 1);

        // Processing orders using polymorphism
        OrderProcessor.processOrder(vegBurger);
        OrderProcessor.processOrder(chickenPizza);
    }
}
