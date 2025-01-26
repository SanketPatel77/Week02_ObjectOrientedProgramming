package encapsulation_and_polymorphism.bankingmanagementsystem;


// Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
abstract class BankAccount implements Loanable{
    // attributes
    private int accountNumber;
    String holderName;
    private double balance;

    // constructors
    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    // Adding methods like deposit(double amount) and withdraw(double amount) (concrete) and calculateInterest() (abstract).

    void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    double withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Not enough Balance");
            return -1;
        }
        balance -= amount;
        return amount;
    }

    abstract double calculateInterest(int years);
    void accountDetails() {
        System.out.println("The account number is : "+ accountNumber+ " Has balance of : "+ balance);
    }
    // getter for getting balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}