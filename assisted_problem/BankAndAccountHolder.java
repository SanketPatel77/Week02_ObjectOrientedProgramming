import java.util.ArrayList;

public class BankAndAccountHolder {
    public static void main(String[] args) {
        // Create bank objects
        Bank sbi = new Bank("SBI", "Bhopal");
        Bank uco = new Bank("UCO", "Bhagalpur");

        // Create customer objects
        Customer customer1 = new Customer("Sanket", "Male", 23, "34523234");
        Customer customer2 = new Customer("Ankit", "Male", 22, "3523226663");

        // Open accounts in SBI bank
        sbi.openAccount(customer1);
        customer1.addAccount(sbi);
        sbi.openAccount(customer2);
        customer2.addAccount(sbi);

        // Open accounts in UCO bank
        uco.openAccount(customer1);
        customer1.addAccount(uco);
        uco.openAccount(customer2);
        customer2.addAccount(uco);

        // Display bank details
        sbi.displayBankDetails();
        uco.displayBankDetails();

        // Display customer details in each bank
        sbi.showCustomersDetails();
        uco.showCustomersDetails();

        // Display accounts of each customer
        customer1.getAllAccounts();
        customer2.getAllAccounts();
    }
}

// Bank class definition
class Bank {
    private String bankName;
    private String branchName;
    private int numberOfCustomers;
    private ArrayList<Customer> customers;

    // Parameterized constructor
    Bank(String name, String branchName) {
        this.bankName = name;
        this.branchName = branchName;
        this.customers = new ArrayList<>();
    }

    // Getters
    public String getBankName() {
        return bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    // Open an account for a customer
    public void openAccount(Customer customer) {
        if (!customers.contains(customer)) {
            customers.add(customer);
            numberOfCustomers++;
            System.out.println("Account for " + customer.getName() + " opened successfully in " + bankName + ".");
        } else {
            System.out.println(customer.getName() + " already has an account in " + bankName + ".");
        }
    }

    // Display bank details
    public void displayBankDetails() {
        System.out.println("Bank Name: " + bankName + ", Branch: " + branchName
                + ", Total Customers: " + numberOfCustomers);
    }

    // Display all customer details
    public void showCustomersDetails() {
        System.out.println("Customers in " + bankName + " branch:");
        for (Customer customer : customers) {
            System.out.println("- " + customer.getName() + ", Age: " + customer.getAge()
                    + ", Mobile: " + customer.getMobileNumber());
        }
    }
}

// Customer class definition
class Customer {
    private String name;
    private String gender;
    private int age;
    private String mobileNumber;
    private ArrayList<Bank> accounts;

    // Parameterized constructor
    Customer(String name, String gender, int age, String mobileNumber) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.accounts = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    // Add a bank account to the customer's record
    public void addAccount(Bank account) {
        if (!accounts.contains(account)) {
            accounts.add(account);
            System.out.println(name + " added an account in " + account.getBankName() + ".");
        } else {
            System.out.println(name + " already has an account in " + account.getBankName() + ".");
        }
    }

    // Display all accounts associated with the customer
    public void getAllAccounts() {
        System.out.println(name + "'s Bank Accounts:");
        for (Bank account : accounts) {
            System.out.println("- Bank: " + account.getBankName() + ", Branch: " + account.getBranchName());
        }
    }
}
