import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee's salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter years of service: ");
        int yearsOfService = scanner.nextInt();

        // Check if service is more than 5 years
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus awarded: ₹" + bonus);
        } else {
            System.out.println("No bonus. Minimum 6 years of service required.");
        }
    }
}
