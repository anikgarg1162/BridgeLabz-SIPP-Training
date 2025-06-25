import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double first, second;
        String op;

        System.out.print("Enter the first number: ");
        first = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        second = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        op = scanner.next();

        // Use switch to perform operation
        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                if (second == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                } else {
                    System.out.println("Result: " + (first / second));
                }
                break;
            default:
                System.out.println("Invalid Operator.");
        }
    }
}
