package encapsulation_and_polymorphism.hospitalmanagementsystem;

class InPatient extends Patient{

    int InPatientFee;
    // using different billing logic
    @Override
    int calculateBill() {
        return InPatientFee;
    }
    public InPatient(int patientId, String name, int age, String diagnosisName, int inPatientFee) {
        super(patientId, name, age, diagnosisName);
        InPatientFee = inPatientFee;
    }

}
