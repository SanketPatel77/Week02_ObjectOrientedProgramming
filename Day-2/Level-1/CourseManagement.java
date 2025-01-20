public class CourseManagement {
    // Main Method for Testing
    public static void main(String[] args) {
        // Create courses
        Course course1 = new Course("Java Programming", 12, 599.99);
        Course course2 = new Course("Web Development", 10, 499.99);

        // Display course details before updating institute name
        System.out.println("Before Updating Institute Name:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();

        // Update the institute name
        Course.updateInstituteName("TechMaster Academy");

        // Display course details after updating institute name
        System.out.println("\nAfter Updating Institute Name:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
    }
}


class Course {
    // Instance Variables
    private String courseName;
    private int duration; // Duration in weeks
    private double fee;

    // Class Variable
    private static String instituteName = "Global Tech Academy";

    // Default Constructor
    public Course() {
        this.courseName = "Unknown Course";
        this.duration = 0;
        this.fee = 0.0;
    }

    // Parameterized Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance Method: Display course details
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
    }

    // Class Method: Update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
        System.out.println("Institute name updated to: " + instituteName);
    }
}
