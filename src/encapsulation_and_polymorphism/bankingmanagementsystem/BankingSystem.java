package encapsulation_and_polymorphism.bankingmanagementsystem;

// class BnakingSystem main method (Entry point
public class BankingSystem {
    public static void main(String[] args) {
        // example
        BankAccount savingsAccount1 = new SavingsAccount(9483, "sahil", 200000);
        BankAccount currentAccount1 = new CurrentAccount(435, "Sagar", 1000000);

        // checking for loan eligible
        if (currentAccount1.calculateLoanEligibility()) {
            System.out.println("Account is eligible for loan");
        }else {
            System.out.println("Account is not eligible for loan");
        }

        // appliying for loan
        currentAccount1.applyForLoan();

        // savings account intrest calculation for 5 years
        System.out.println(savingsAccount1.calculateInterest(5));
    }
}