public class ProductDetails {

    // Main Method for Testing
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Laptop", 899.99);
        Product product2 = new Product("Smartphone", 499.99);
        Product product3 = new Product("Tablet", 299.99);

        // Display individual product details
        System.out.println("Product 1 Details:");
        product1.displayProductDetails();

        System.out.println("\nProduct 2 Details:");
        product2.displayProductDetails();

        System.out.println("\nProduct 3 Details:");
        product3.displayProductDetails();

        // Display total products created
        System.out.println("\nSummary:");
        Product.displayTotalProducts();
    }
}

class Product {
    // Instance Variables
    private String productName;
    private double price;

    // Class Variable
    private static int totalProducts = 0;

    // Default Constructor
    public Product() {
        this.productName = "Unknown Product";
        this.price = 0.0;
        totalProducts++; // Increment total products when a product is created
    }

    // Parameterized Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment total products when a product is created
    }

    // Instance Method: Display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class Method: Display total products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}
