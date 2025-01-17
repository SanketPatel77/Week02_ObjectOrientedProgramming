public class StudentReport {
    public static void main(String[] args) {
     Student uday = new Student("Uday Pratap Kourav",98.0,102);
     uday.studentDetails();
    }
}
//class for student
class Student{
    String name;
    int rollNumber;
    double marks;

    Student(String name,double marks,int rollNumber){
        this.name=name;
        this.marks=marks;
        this.rollNumber=rollNumber;

    }
//Method for providing grade based of marks
    public String grade(){
        if(marks>80){
            return "A";
        } else if (marks>=70 && marks<80) {
            return "B";
        } else if (marks>=60 && marks<70) {
            return "C";

        } else if (marks>=50 && marks<40) {
            return "D";
        }else {
            return "F";
        }

    }

//Method for displaying details
    public void studentDetails(){
        System.out.println("Student's detail: ");
        System.out.println("Name : "+name);
        System.out.println("RollNumber : "+rollNumber);
        System.out.println("Marks : "+marks);
        System.out.println("Grade :"+grade());
    }
}