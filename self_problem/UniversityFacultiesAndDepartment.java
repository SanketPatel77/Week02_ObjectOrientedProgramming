package Day_4.self_problem;

import java.util.ArrayList;
import java.util.Scanner;

public class UniversityFacultiesAndDepartment {
    public static void main(String[] args) {
        // University class object creation
        University university = new University("RGPV", 2);
        university.getUniversityDetails();
    }
}

class University {
    // Attributes
    private String universityName;
    private int numberOfDepartment;
    // All departments record
    private ArrayList<Department> departments;
    // List of teachers without any department
    private ArrayList<Faculty> faculties;

    // Scanner declaration for taking input for department-related information
    private Scanner input;

    // Parameterized constructor
    University(String universityName, int numberOfDepartment) {
        this.universityName = universityName;
        this.numberOfDepartment = numberOfDepartment;
        departments = new ArrayList<>();
        faculties = new ArrayList<>();
        input = new Scanner(System.in);
        createDepartment();
    }

    // Display details of the university
    public void getUniversityDetails() {
        System.out.println("University name is " + universityName + " and it has " + numberOfDepartment
                + " departments. Details of each department are: ");

        for (Department department : departments) {
            System.out.println("Department name is " + department.depName + " and it has " + department.facultyCount
                    + " faculties, and their details are: ");

            for (Faculty faculty : department.deptFaculty) {
                System.out.println(
                        "Name: " + faculty.name + ", Subject: " + faculty.subject + ", Gender: " + faculty.gender);
            }
        }
    }

    // Department class definition
    private class Department {
        // Attributes
        private String depName;
        private int facultyCount;
        private ArrayList<Faculty> deptFaculty;

        Department(String depName, int facultyCount) {
            this.depName = depName;
            this.facultyCount = facultyCount;
            deptFaculty = new ArrayList<>();
        }
    }

    // Faculty class definition
    private class Faculty {
        private String name;
        private String subject;
        private String gender;

        Faculty(String name, String subject, String gender) {
            this.name = name;
            this.subject = subject;
            this.gender = gender;
        }
    }

    // Method to create departments
    private void createDepartment() {
        for (int i = 0; i < numberOfDepartment; i++) {
            System.out.println("Enter department details (name, number of faculties): ");
            String departmentName = input.nextLine();
            int numberOfFaculty = input.nextInt();
            input.nextLine(); // Consume the leftover newline character
            Department department = new Department(departmentName, numberOfFaculty);
            departments.add(department);
            enterFacultyDetails(numberOfFaculty, department);
        }

        // Closing the scanner object
        input.close();
    }

    // Method to input faculty details for each department
    private void enterFacultyDetails(int numberOfFaculty, Department department) {
        for (int i = 0; i < numberOfFaculty; i++) {
            System.out.println("Enter faculty details (name, subject, gender): ");
            String name = input.nextLine();
            String subject = input.nextLine();
            String gender = input.nextLine();
            Faculty faculty = new Faculty(name, subject, gender);
            faculties.add(faculty);
            department.deptFaculty.add(faculty);
        }
    }
}
