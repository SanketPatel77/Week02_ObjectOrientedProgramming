// Base class: BankAccount
class BankAccount {
    // Attributes
    public String accountNumber;       // Public member
    protected String accountHolder;    // Protected member
    private double balance;            // Private member

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get the balance
    public double getBalance() {
        return balance;
    }

    // Public method to set the balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate; // Specific attribute for SavingsAccount

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance); // Call the superclass constructor
        this.interestRate = interestRate;
    }

    // Method to display savings account details
    public void displaySavingsAccountDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber); // Access public member
        System.out.println("Account Holder: " + accountHolder); // Access protected member
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Main class to test the implementation
public class BankAccountManagement {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount("123456789", "John Doe", 5000.00);
        System.out.println("Bank Account Details:");
        account.displayAccountDetails();

        // Modify the balance
        account.setBalance(7000.00);
        System.out.println("\nUpdated Bank Account Details:");
        account.displayAccountDetails();

        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("987654321", "Alice Smith", 10000.00, 3.5);
        System.out.println("\nSavings Account Details:");
        savingsAccount.displaySavingsAccountDetails();
    }
}
