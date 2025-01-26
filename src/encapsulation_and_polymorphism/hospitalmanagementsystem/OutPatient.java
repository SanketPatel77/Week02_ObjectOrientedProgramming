package encapsulation_and_polymorphism.hospitalmanagementsystem;

class OutPatient extends Patient{

    // attributes
    int totalDays;

    // using different billing logic
    @Override
    int calculateBill() {
        // total fee of out patient
        int perDayFees = 10000;
        return perDayFees * totalDays;
    }
    public OutPatient(int patientId, String name, int age, String diagnosisName, int totalDays) {
        super(patientId, name, age, diagnosisName);
        this.totalDays = totalDays;
    }


}