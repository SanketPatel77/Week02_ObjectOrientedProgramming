import java.util.Scanner;

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CartItem[] cart = new CartItem[5];  // Fixed size cart for up to 5 items
        int itemCount = 0;

        int choice;
        do {
            System.out.println("\n--- Shopping Cart System ---");
            System.out.println("1. Add Item to Cart");
            System.out.println("2. Remove Item from Cart");
            System.out.println("3. Display Total Cost");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Clear the buffer

            switch (choice) {
                case 1:
                    if (itemCount >= cart.length) {
                        System.out.println("Cart is full! Cannot add more items.");
                        break;
                    }
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter item price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter item quantity: ");
                    int quantity = scanner.nextInt();
                    cart[itemCount] = new CartItem(itemName, price, quantity);
                    itemCount++;
                    System.out.println("Item added to cart successfully!");
                    break;

                case 2:
                    if (itemCount == 0) {
                        System.out.println("Cart is empty! No items to remove.");
                        break;
                    }
                    System.out.print("Enter the item name to remove: ");
                    String removeItemName = scanner.nextLine();
                    boolean itemRemoved = false;
                    for (int i = 0; i < itemCount; i++) {
                        if (cart[i].getItemName().equalsIgnoreCase(removeItemName)) {
                            cart[i] = cart[itemCount - 1];  // Replace with last item
                            cart[itemCount - 1] = null;     // Clear last slot
                            itemCount--;
                            itemRemoved = true;
                            System.out.println("Item removed from cart.");
                            break;
                        }
                    }
                    if (!itemRemoved) {
                        System.out.println("Item not found in the cart.");
                    }
                    break;

                case 3:
                    double totalCost = 0;
                    if (itemCount == 0) {
                        System.out.println("Cart is empty.");
                    } else {
                        System.out.println("\nCart Items:");
                        for (int i = 0; i < itemCount; i++) {
                            cart[i].displayItemDetails();
                            totalCost += cart[i].getTotalCost();
                        }
                        System.out.println("Total Cost: $" + totalCost);
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the Shopping Cart System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize item details
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter for itemName
    public String getItemName() {
        return itemName;
    }

    // Method to calculate total cost for the item
    public double getTotalCost() {
        return price * quantity;
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item: " + itemName + ", Price: $" + price + ", Quantity: " + quantity + ", Total: $" + getTotalCost());
    }
}