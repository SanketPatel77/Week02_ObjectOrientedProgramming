//this is the main class
public class EmployeeDetails {
    public static void main(String[] args) {
        Employee e = new Employee("uday",01,10000.0);
        e.displayDetails();
    }
}


//this is the another class
class Employee{
    String name ;
    int id ;
    double salary;
    Employee(String name,int id,double salary){
        this.name= name;
        this.id = id;
        this.salary = salary;

    }


    public void displayDetails(){
        System.out.println("Employee Details:");
        System.out.println("Name of Employee is: "+name);
        System.out.println("Employee id is: "+id);
        System.out.println("The salary of Employee is: "+ salary);

    }



}
