package Day_4.self_problem;

import java.util.ArrayList;
import java.util.List;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create objects
        Student raj = new Student("Raj");
        Student pankaj = new Student("Pankaj");
        Professor sumit = new Professor("Sumit");
        Professor raju = new Professor("Raju");

        // Create courses with unique codes
        Course math101 = new Course("Math 101", "MATH_101");
        Course english102 = new Course("English 102", "ENGLISH_102");

        // Assign professors to courses
        math101.setProfessor(sumit);
        english102.setProfessor(raju);

        // Enroll students in courses
        raj.enrollCourse(math101);
        raj.enrollCourse(english102);
        pankaj.enrollCourse(math101);

        // Display information
        System.out.println("\nCourse Details:");
        System.out.println(math101.getCode() + " Professor: " + math101.getProfessor().getName());
        System.out.println("Students enrolled in " + math101.getName() + ":");
        for (Student student : math101.getEnrolledStudents()) {
            System.out.println(" - " + student.getName());
        }

        System.out.println("\n" + english102.getCode() + " Professor: " + english102.getProfessor().getName());
        System.out.println("Students enrolled in " + english102.getName() + ":");
        for (Student student : english102.getEnrolledStudents()) {
            System.out.println(" - " + student.getName());
        }
    }
}

class Student {
    private String name;
    private List<Course> enrolledCourses;

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        course.enrollStudent(this); // Update course with student enrollment
        System.out.println(name + " enrolled in " + course.getName());
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }
}

class Professor {
    private String name;
    private List<Course> taughtCourses;

    public Professor(String name) {
        this.name = name;
        this.taughtCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Course course) {
        taughtCourses.add(course);
        System.out.println(name + " assigned to teach " + course.getName());
    }

    public List<Course> getTaughtCourses() {
        return taughtCourses;
    }
}

class Course {
    private String name;
    private String code; // Added unique course code
    private Professor professor;
    private List<Student> enrolledStudents;

    public Course(String name, String code) {
        this.name = name;
        this.code = code;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}
