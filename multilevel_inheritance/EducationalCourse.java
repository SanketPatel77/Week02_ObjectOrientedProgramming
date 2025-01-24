package multilevel_inheritance;

// Course class (Base class)
class Course {
    //attributes
    private String courseName;
    private int duration;

    // constructor
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration; // duration in months
    }

    // setters and getters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

// OnlineCourse class (inherit course class)
class OnlineCourse extends Course {
    // attributes
    private String platform;
    private boolean isRecorded;

    // constructor
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }


    // setters and getters
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public boolean getIsRecorded() {
        return isRecorded;
    }

    public void setRecorded(boolean recorded) {
        isRecorded = recorded;
    }
}

// PaidOnlineCourse class (inherit OnlineCourse class)
class PaidOnlineCourse extends OnlineCourse {
    // attributes
    private  int fee;
    private  double discount; // in percent

    // constructor
    public PaidOnlineCourse(String courseName, int duration,String platform, boolean isRecorded, int fee, int discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Method to calculate discount
    public double calculateDiscount(){
        return (fee - (fee * (discount/100)));
    }

//    setters and getters
    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    // method to check course if recorded or not
    public  String isCourseRecorded(){
        if(getIsRecorded()){
            return "Course is recorded";
        }else{
           return "Course is not recorded";
        }
    }

    // Method to display details
    public void displayInfo(){
        System.out.println("\nCourse Details ");
        System.out.println("\nCourse Name : "+getCourseName()+
                "\nCourse Duration : "+getDuration()+
                " months"+"\nPlatform : "+getPlatform()+
                "\nIs course Recorded : "+isCourseRecorded()+
                "\nCourse Fee Before Discount : "+getFee()+
                "\nDiscount Percent : "+getDiscount()+"%"+
                "\nFee After Discount : "+calculateDiscount()
        );
    }
}

// class with main method
public class EducationalCourse {
    public static void main(String[] args) {
        // create object of PaidOnlineCourse
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Machine Learning",3,"Code-Help",true,10000,25);
        paidCourse.displayInfo();
    }
}