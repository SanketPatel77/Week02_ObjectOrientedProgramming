package multilevel_inheritance;

// Base class Order
class Order {
    // attribute
    private int orderId;
    private String orderDate;

    // constructor
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // setters and getters
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderDate() {
        return orderDate;
    }
}

// ShippingOrder class (subclass of Order class)
class ShippingOrder extends Order {
    // attributes
    private int trackingNumber;

    // constructor
    ShippingOrder(int orderId, String orderDate, int trackingNumber) {
        super(orderId, orderDate); // calling parent class constructor
        this.trackingNumber = trackingNumber;
    }

    // setter and getter
    public void setTrackingNumber(int trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public int getTrackingNumber() {
        return trackingNumber;
    }
}

// DeliveryOrder class (subclass of ShippingOrder class)
class DeliveryOrder extends ShippingOrder {
    // attributes
    private String deliveryDate;

    // constructor
    DeliveryOrder(int orderId, String orderDate, int trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber); // calling parent class constructor
        this.deliveryDate = deliveryDate;
    }

    // setter and getter
    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    // method to display order status
    public void getOrderStatus() {
        System.out.println("Order Details ");
        System.out.println("\nOrder Id : " + getOrderId() + "\nOrder Date : " + getOrderDate() + "\nTracking Number : "
                + getTrackingNumber() + "\nExpected Delivery Date : " + getDeliveryDate());
    }
}

// class with main method (entry point)
public class RetailOrderManagement {
    public static void main(String[] args) {
        // create object of delivery order class
        DeliveryOrder orderDetails = new DeliveryOrder(001, "24-01-2025", 1123650, "28-01-2025");

        orderDetails.getOrderStatus();
    }
}