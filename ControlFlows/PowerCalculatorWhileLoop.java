import java.util.Scanner;

public class PowerCalculatorWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the power (non-negative integer): ");
        int power = scanner.nextInt();

        if (power < 0) {
            System.out.println("Please enter a non-negative integer for power.");
            return;
        }

        int result = 1;
        int counter = 0;

        while (counter < power) {
            result *= number;
            counter++;
        }

        // Print the result
        System.out.println(number + " raised to the power " + power + " is: " + result);
    }
}
