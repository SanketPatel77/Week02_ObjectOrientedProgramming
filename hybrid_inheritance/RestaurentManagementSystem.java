package hybrid_inheritance;

// Person class (superclass)
class Person {
    // attributes
    private String name;
    private int id;

    // Constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("\nName : " + name + "\nid : " + id);
    }
}

// Interface
interface Worker {
    public void performDuties();
}

// Chef class inherit Person class and impliment Worker interface
class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    // method to display name and id
    @Override
    public void display() {
        super.display();
    }

    // method to display duties of person
    @Override
    public void performDuties() {
        System.out.println("Chef cooks food");
    }
}

class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    // method to display name and id
    @Override
    public void display() {
        super.display();
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter serves food");
    }
}

// class having main method
public class RestaurentManagementSystem {
    public static void main(String[] args) {
        // Chef class's object
        Chef chef = new Chef("Karan", 101);
        // Waiter class's object
        Waiter waiter = new Waiter("Rahul", 102);

        // call for display and performDuties method by both objects
        chef.display();
        chef.performDuties();

        waiter.display();
        waiter.performDuties();
    }
}
