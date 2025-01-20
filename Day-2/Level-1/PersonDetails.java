public class PersonDetails {
    // Main method for testing
    public static void main(String[] args) {
        // Creating an original Person object
        Person original = new Person("John Doe", 30, "123 Main Street");

        // Cloning the original using the copy constructor
        Person clone = new Person(original);

        // Printing both objects
        System.out.println("Original: " + original);
        System.out.println("Clone: " + clone);
    }
}


 class Person {
    private String name;
    private int age;
    private String address;

    // Default constructor
    public Person() {
        this.name = "";
        this.age = 0;
        this.address = "";
    }

    // Parameterized constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.address = other.address;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Overriding toString() for better representation
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", address='" + address + "'}";
    }
}
