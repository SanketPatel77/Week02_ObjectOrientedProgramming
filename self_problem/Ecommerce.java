package Day_4.self_problem;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce {
    public static void main(String[] args) {
        // Create products
        Product phone = new Product("Smartphone", 999.99);
        Product laptop = new Product("Laptop", 1499.99);
        Product headphones = new Product("Headphones", 199.99);

        // Create customers
        Customer raj = new Customer("Raj");
        Customer pankaj = new Customer("Pankaj");

        // Create orders
        Order rajOrder1 = new Order(1, raj);
        Order rajOrder2 = new Order(2, raj);
        Order pankajOrder = new Order(3, pankaj);

        // Add products to orders
        rajOrder1.addProduct(phone);
        rajOrder1.addProduct(headphones);
        rajOrder2.addProduct(laptop);
        pankajOrder.addProduct(phone);
        pankajOrder.addProduct(laptop);

        // Place orders for customers
        raj.placeOrder(rajOrder1);
        raj.placeOrder(rajOrder2);
        pankaj.placeOrder(pankajOrder);

        // Display customer orders and order details
        for (Customer customer : List.of(raj, pankaj)) {
            System.out.println("Customer: " + customer.getName());
            for (Order order : customer.getOrders()) {
                System.out.println(" - Order ID: " + order.getOrderId());
                System.out.println("   - Products:");
                for (Product product : order.getProducts()) {
                    System.out.println("     - " + product.getName() + " - $" + product.getPrice());
                }
                System.out.println("   - Total: $" + order.calculateTotal());
            }
        }
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private int orderId;
    private Customer customer;
    private List<Product> products;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }
}