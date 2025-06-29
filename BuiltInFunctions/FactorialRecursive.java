import java.util.Scanner;

public class FactorialRecursive {

    // Function to take user input
    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find factorial: ");
        int num = sc.nextInt();
        return num;
    }

    // Recursive function to calculate factorial
    public static long factorial(int n) {
        if (n < 0)
            return -1; 
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    // Function to display result
    public static void displayResult(int num, long result) {
        if (result == -1) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + num + " is: " + result);
        }
    }

    // Main method
    public static void main(String[] args) {
        int number = getInput();
        long result = factorial(number);
        displayResult(number, result);
    }
}
