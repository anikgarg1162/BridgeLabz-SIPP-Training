import java.util.*;

class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    // Constructor
    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println( amount + " deposited successfully.");
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount must be greater than 0.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println( amount + " withdrawn successfully.");
        }
    }

    // Display balance
    void displayBalance() {
        System.out.println("Current Balance: "+ balance);
    }
}

public class SimpleATMSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter account number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();

        BankAccount account = new BankAccount(name, accountNumber, initialBalance);

        // Deposit once
        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        // Withdraw once
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        // Display final balance
        System.out.println("\n- Final Account Summary -");
        account.displayBalance();
    }
}
