package encapsulation_and_polymorphism.hospitalmanagementsystem;

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient inPatient1 = new InPatient(554, "Rahul", 14, "nuabcll", 2000);
        Patient outPatient1 = new OutPatient(999, "rishi", 99, "Old age", 20);

        // calculate bill by different logic
        System.out.println(inPatient1.calculateBill());
        System.out.println(outPatient1.calculateBill());

        // add record
        inPatient1.addRecord();
        // viewRecord
        outPatient1.viewRecord();

        // printing the patient details
        inPatient1.getPatientDetails();
        outPatient1.getPatientDetails();
    }
}