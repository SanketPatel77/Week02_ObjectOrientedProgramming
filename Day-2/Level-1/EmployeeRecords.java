// Base class: Employee
class Employee {
    // Attributes
    public String employeeID;         // Public member
    protected String department;      // Protected member
    private double salary;            // Private member

    // Constructor
    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to get the salary
    public double getSalary() {
        return salary;
    }

    // Public method to modify the salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass: Manager
class Manager extends Employee {
    private int teamSize; // Specific attribute for Managers

    // Constructor
    public Manager(String employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary); // Call the superclass constructor
        this.teamSize = teamSize;
    }

    // Method to display manager details
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID); // Access public member
        System.out.println("Department: " + department); // Access protected member
        System.out.println("Team Size: " + teamSize);
    }
}

// Main class to test the implementation
public class EmployeeRecords {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("E001", "IT", 50000.00);
        System.out.println("Employee Details:");
        emp.displayEmployeeDetails();

        // Modify the salary
        emp.setSalary(55000.00);
        System.out.println("\nUpdated Employee Details:");
        emp.displayEmployeeDetails();

        // Create a Manager object
        Manager manager = new Manager("M001", "HR", 80000.00, 10);
        System.out.println("\nManager Details:");
        manager.displayManagerDetails();
    }
}
