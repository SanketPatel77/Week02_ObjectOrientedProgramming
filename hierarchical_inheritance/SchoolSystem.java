package hierarchical_inheritance;

// Persong class (super class)
class Person{
    // attributes
    private String name;
    private  int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person's name and age
    public void displayDetails(){
        System.out.println("Name : "+name+"\nage : "+age);
    }

}

// Teacher class subclass of Person class
class Teacher extends Person{
    // attributes
    private String subject;

    //Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Method to display role
    public void displayRole(){
        System.out.println("\nTeacher' Details");
        super.displayDetails(); // details from parent class
        System.out.println("Role : Teacher \nTeach "+subject+" subject");
    }

}

//Student class inherit Person class
class Student extends Person{
    // attribute
    private String grade;

    // constructor
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    // Method to display role
    public void displayRole(){
        System.out.println("\nStudent's Details");
        super.displayDetails(); // details from parent class
        System.out.println("Role : Student \nGrade : "+grade);
    }
}


// Staff class inherit Person class
class Staff extends Person{
    // attribute
    private String designation;

//    Constructor
    public Staff(String name, int age, String designation) {
        super(name, age);
        this.designation = designation;
    }

    // Method to display role
    public void displayRole(){
        System.out.println("\nStaff's Details");
        super.displayDetails(); // details from parent class
        System.out.println("Role : Staff \nDesignation : "+designation);
    }
}

// class have main method
public class SchoolSystem {
    public static void main(String[] args) {
        // create objects for all subclasses
        Teacher teacher = new Teacher("Yogesh",51,"Physics");
        Student student = new Student("Ankit", 15, "B+");
        Staff staff = new Staff("Ramesh",42,"Driver");

        //call of displayRole()
        teacher.displayRole();
        student.displayRole();
        staff.displayRole();

    }
}
