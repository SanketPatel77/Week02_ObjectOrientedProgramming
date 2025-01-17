import java.util.Scanner;
//This is the main class
public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of Circle: ");
        double radius=sc.nextDouble();
        CalculateAreaOfCircle a = new CalculateAreaOfCircle(radius);
        //Calculating Area of Circle
        a.areaOfCircleIs();
        //Displaying area of circle
        a.displayResult();

        sc.close();
    }
}
//This is another Class
class CalculateAreaOfCircle{
   public double radius;
   public double result;
    CalculateAreaOfCircle(double radius){
        this.radius = radius;

    }
//Method for calculating Area of Circle
    public double areaOfCircleIs(){
       double area=Math.PI*this.radius*this.radius;
        return area;
    }
    //method for calculating the circumference of the circle
    public double  circumferenceOfCircle(){
        double circumference =2*Math.PI*this.radius;
        return circumference;
    }

    //Method for displaying the Area of circle
    public void displayResult(){
        double radius =this.radius;
        System.out.println("Area of circle is :"+areaOfCircleIs());
        System.out.println("Circumference of the circle is :"+circumferenceOfCircle());
    }


}