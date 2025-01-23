import java.util.ArrayList;
import java.util.Scanner;

public class CompanyAndDepartment {
    public static void main(String[] args) {
        Company shiv = new Company("Shiv", 1999, 2);
        shiv.getCompanyDetails();
    }
}

class Company {
    // Attributes of the Company class
    private String name;
    private int estYear;
    private int numberOfDepartment;
    private final ArrayList<Department> departments;

    // Initializing the scanner object
    private Scanner input;

    // Parameterized constructor
    Company(String name, int estYear, int numberOfDepartment) {
        this.name = name;
        this.estYear = estYear;
        this.numberOfDepartment = numberOfDepartment;
        input = new Scanner(System.in);
        departments = addAllDepartmentDetails();
    }

    // Department class definition
    private class Department {
        private String depName;
        private int numberOfEmployees;
        private final ArrayList<Employee> employees;

        Department(String depName, int numberOfEmployees) {
            this.depName = depName;
            this.numberOfEmployees = numberOfEmployees;
            employees = addAllEmployees();
        }

        private class Employee {
            // Attributes of employee class
            private String empName;
            private int empAge;

            // Parameterized constructor
            Employee(String name, int age) {
                this.empName = name;
                this.empAge = age;
            }

            // Displaying the details of employee
            public void showEmployeeDetails() {
                System.out.println("Employee created: " + empName + ", Age: " + empAge);
            }
        }

        private ArrayList<Employee> addAllEmployees() {
            ArrayList<Employee> tempEmployees = new ArrayList<>();

            for (int i = 0; i < numberOfEmployees; i++) {
                input.nextLine(); // Consume leftover newline character
                System.out.print("Enter the details of employee " + (i + 1) + " (name age): ");
                String empName = input.nextLine(); // Read full name with spaces
                int age = input.nextInt();

                Employee employee = new Employee(empName, age);
                tempEmployees.add(employee);
                employee.showEmployeeDetails();
            }

            return tempEmployees;
        }

        public void showAllEmployees() {
            for (Employee employee : employees) {
                System.out.println("Employee name: " + employee.empName + ", Age: " + employee.empAge);
            }
        }
    }

    // Method for getting all department details
    private ArrayList<Department> addAllDepartmentDetails() {
        ArrayList<Department> tempDepartment = new ArrayList<>();

        for (int i = 0; i < numberOfDepartment; i++) {
            System.out.print("Enter the details of department " + (i + 1) + " (name numberOfEmployees): ");
            input.nextLine(); // Consume newline left from previous input
            String depName = input.nextLine();
            int numberOfEmployees = input.nextInt();

            Department department = new Department(depName, numberOfEmployees);
            tempDepartment.add(department);
        }

        return tempDepartment;
    }

    // Method for displaying all the department details within the company
    private void getAllDepartmentDetails() {
        for (Department department : departments) {
            System.out.println("Department: " + department.depName + ", Employees: " + department.numberOfEmployees);
            department.showAllEmployees();
            System.out.println("----------------------------------");
        }
    }

    // Method for getting the company details
    public void getCompanyDetails() {
        System.out.println("Company: " + name + ", Established: " + estYear);
        getAllDepartmentDetails();
        input.close(); // Closing scanner after use
    }
}
