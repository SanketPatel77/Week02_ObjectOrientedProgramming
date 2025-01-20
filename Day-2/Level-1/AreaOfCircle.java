class Circle {
    // Attribute
    private double radius;

    // Default Constructor
    public Circle() {
        this(1.0); // Default radius is 1.0
    }

    // Parameterized Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Display Circle Details
    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}

public class AreaOfCircle{
	
    // Main method for testing
    public static void main(String[] args) {
        // Using Default Constructor
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle:");
        defaultCircle.displayDetails();

        // Using Parameterized Constructor
        Circle customCircle = new Circle(5.0);
        System.out.println("\nCustom Circle:");
        customCircle.displayDetails();
    }
}
