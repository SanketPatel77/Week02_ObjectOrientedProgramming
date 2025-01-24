package hierarchical_inheritance;

// class BankAccount is superclass
class BankAccount {
    // attributes
    private long accountNumber;
    private double accountBalance;

    // Constructor
    public BankAccount(long accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    // setters and getters
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    // Method to display account details
    public void displayAccountType(){
       // print account number and balance
        System.out.println("Account Number is : "+getAccountNumber());
        System.out.println("Account Balance is : "+getAccountBalance());
    }
}

// SavingAccount (subclass that inherit BankAccount)
class SavingAccount extends BankAccount {
    // attributes
    private double interestRate;

    public SavingAccount(long accountNumber, double accountBalance, double interestRate) {
        super(accountNumber, accountBalance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    // Method to display account details
    public void displayAccountType(){
        System.out.println("\nThis is Saving Account");
        super.displayAccountType();
        System.out.println("Interest Rate is : "+getInterestRate());
    }
}

// CheckingAccount (subclass that inherit BankAccount)
class CheckingAccount extends BankAccount{
    // attributes
    private double withdrawalLimit;

//    Constructor
    public CheckingAccount(long accountNumber, double accountBalance, double withdrawalLimit) {
        super(accountNumber, accountBalance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimit(double withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    // Method to display account details
    public void displayAccountType(){
        System.out.println("\nThis is Checking Account");
        super.displayAccountType();
        System.out.println("Withdraw Limit For Account is : "+getWithdrawalLimit());
    }
}

// FixedDepositeAccount (subclass that inherit BankAccount)
class FixedDepositeAccount extends BankAccount{
    //attributes
    private double duration;

    //Constructor
    public FixedDepositeAccount(long accountNumber, double accountBalance, double duration) {
        super(accountNumber, accountBalance);
        this.duration = duration;
    }

    // setter and getter
    public double getDuration() {
        return  duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
@Override
    // Method to display account details
    public void displayAccountType(){
        System.out.println("\nThis is FD Account");
       super.displayAccountType();
        System.out.println("Duration of this FD Account is : "+getDuration());
    }
}


// class with main method
class BankAccountTypes{
    // main method
    public static void main(String[] args) {
        // create objects
        SavingAccount savingAccount = new SavingAccount(2025843501,25000,2.5);
        CheckingAccount checkingAccount = new CheckingAccount(2024213650,500000,15000);
        FixedDepositeAccount fdAccount = new FixedDepositeAccount(2025567005,250000,3);

        // call display method by different objects
        savingAccount.displayAccountType();
        checkingAccount.displayAccountType();
        fdAccount.displayAccountType();
    }
}