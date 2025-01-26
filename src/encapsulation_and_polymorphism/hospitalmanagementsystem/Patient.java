package encapsulation_and_polymorphism.hospitalmanagementsystem;

// Create an abstract class Patient with fields like patientId, name, and age.
abstract class Patient implements MedicalRecord {
    // attributes
    private int patientId;
    private String name;
    private int age;
    private String diagnosisName;

    // constructor
    public Patient(int patientId, String name, int age, String diagnosisName) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosisName = diagnosisName;
    }
    public Patient() {
    }

    // Add an abstract method calculateBill()
    abstract int calculateBill();

    // a concrete method getPatientDetails().
    void getPatientDetails() {
        System.out.println("Name of patient is : "+ name+ " admitted id is : "+ patientId+ " and his age is : "+ age+ " diagnosed with : "+ diagnosisName);
    }
    // implementing the addRecord and view Record
    public void addRecord() {
        System.out.println("Record added");
    }

    public void viewRecord() {
        System.out.println("viewing record");
    }

}