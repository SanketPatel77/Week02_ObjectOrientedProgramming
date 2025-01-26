package encapsulation_and_polymorphism.bankingmanagementsystem;

class CurrentAccount extends BankAccount{
    double intresetRate = 0.08;

    // in this account the intreset is added to the debt
    @Override
    double calculateInterest(int years) {
        double intreset = getBalance()* intresetRate * years;
        return intreset;
    }

    public CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void applyForLoan() {
        if (calculateLoanEligibility()) {
            System.out.println("You have applied to get loan sucessfully");
        }

    }

    // if statement to check loan eligibility
    @Override
    public boolean calculateLoanEligibility() {
        if (getBalance() > 100000) { // Collateral
            return true;
        }
        return false;
    }


}