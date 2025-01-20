// Base class: Student
class Student {
    // Attributes
    public int rollNumber;        // Public member
    protected String name;        // Protected member
    private double CGPA;          // Private member

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public methods to access and modify CGPA
    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. It must be between 0.0 and 10.0.");
        }
    }

    // Display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass: PostgraduateStudent
class PostgraduateStudent extends Student {
    private String thesisTitle;

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTitle) {
        super(rollNumber, name, CGPA); // Call the superclass constructor
        this.thesisTitle = thesisTitle;
    }

    // Method to display postgraduate student details
    public void displayPostgraduateDetails() {
        // Accessing protected member 'name' directly
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
        System.out.println("Thesis Title: " + thesisTitle);
    }
}

// Main class to test the implementation
public class UniversityManagement {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student(101, "Alice Johnson", 8.5);
        System.out.println("Student Details:");
        student.displayStudentDetails();

        // Modify CGPA
        student.setCGPA(9.0);
        System.out.println("\nUpdated Student Details:");
        student.displayStudentDetails();

        // Create a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob Smith", 9.2, "Machine Learning in Healthcare");
        System.out.println("\nPostgraduate Student Details:");
        pgStudent.displayPostgraduateDetails();
    }
}
