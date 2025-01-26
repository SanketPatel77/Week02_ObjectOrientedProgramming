package encapsulation_and_polymorphism.bankingmanagementsystem;

// Implement subclasses SavingsAccount and CurrentAccount with unique interest calculations.
class SavingsAccount extends BankAccount {
    double intresetRate = 0.06;

    // in savings account the intreset is added to the balance and can be withdrawn by client
    @Override
    double calculateInterest(int years) {
        double intreset = getBalance()* intresetRate * years;
        setBalance(getBalance() + intreset);
        return intreset;
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


    public SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

}