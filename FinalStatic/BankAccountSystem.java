class BankAccount {

    // Static: shared across all accounts
    static String bankName = "State Bank of India";
    static int totalAccounts = 0;

    // Final: cannot be changed once assigned
    final int accountNumber;

    // Instance variables
    String accountHolderName;
    double balance;

    // Constructor using 'this' keyword
    BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;  // assigning final variable
        this.balance = balance;
        totalAccounts++; // increment total accounts
    }

    // Method to display account details
    void displayDetails() {
        System.out.println("Bank Name       : " + bankName);
        System.out.println("Account Holder  : " + accountHolderName);
        System.out.println("Account Number  : " + accountNumber);
        System.out.println("Balance         : ₹" + balance);
    }

    // Static method to get total number of accounts
    static void getTotalAccounts() {
        System.out.println("Total Accounts Created: " + totalAccounts);
    }
}

// Main class to test the BankAccount class
public class BankAccountSystem {
    public static void main(String[] args) {

        // Creating two bank accounts
        BankAccount acc1 = new BankAccount("Anik Garg", 1001, 15000.00);
        BankAccount acc2 = new BankAccount("Atishay Garg", 1002, 25000.50);

        // Using instanceof to check object type before displaying
        if (acc1 instanceof BankAccount) {
            acc1.displayDetails();
        }

        if (acc2 instanceof BankAccount) {
            acc2.displayDetails();
        }

        // Display total number of accounts created
        BankAccount.getTotalAccounts();
    }
}
