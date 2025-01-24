// Employee class (superclass)
class Employee {
    // attributes of Employee
    private String name;
    private int id;
    private double salary;

    // parametarized constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display details of employee
    public void displayDetails() {
        System.out.println("Name :" + name + ", Id :" + id + ", Salary :" + salary);
    }

}

// Manager class (subclass that extends Employee class)
class Manager extends Employee {
    // attribute of Manager class
    private int teamSize;

    // Constructor
    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary); // calling parents class constuctor to assign name, id, salary of employee
        this.teamSize = teamSize;
    }

    // display method for Manager class
    @Override
    public void displayDetails() {
        System.out.println("\nManager Details :");
        super.displayDetails(); // call for manager details
        System.out.println("Team size of manager is :" + teamSize);
    }

}

// Developer class (subclass that extends Employee class)
class Developer extends Employee {
    // attribute of Developer class
    private String programmingLanguage;

    // Constructor
    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary); // calling parents class constuctor to assign name, id, salary of employee
        this.programmingLanguage = programmingLanguage;
    }

    // display method for Developer class
    @Override
    public void displayDetails() {
        System.out.println("\nDeveloper Details :");
        super.displayDetails(); // call for developer details
        System.out.println("Programming Language of developer is :" + programmingLanguage);
    }

}

// Intern class (subclass that extends Employee class)
class Intern extends Employee {
    // attribute of Intern class
    private int duration; // duration in months

    // Constructor
    Intern(String name, int id, double salary, int duration) {
        super(name, id, salary); // calling parents class constuctor to assign name, id, salary of employee
        this.duration = duration;
    }

    // display method for Developer class
    @Override
    public void displayDetails() {
        System.out.println("\nIntern Details :");
        super.displayDetails(); // call for developer details
        System.out.println("Duration of internship " + duration + " months.");
    }

}

// Class with mian method (Entry point of code)
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // object of Manager class
        Employee manager = new Manager("Sanket Patel", 101, 50000, 10);
        manager.displayDetails(); // call of manager class displayDetails()

        // object of Developer class
        Employee developer = new Developer("Nitin", 112, 40000, "Java");
        developer.displayDetails(); // call of Developer class displayDetails()

        // object of Intern class
        Employee intern = new Intern("Rohit", 555, 5000, 6);
        intern.displayDetails(); // call of Intern class displayDetails()

    }

}