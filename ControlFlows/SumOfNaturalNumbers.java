import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
            return;
        }

        // Sum using while loop
        int sumWhile = 0;
        int i = 1;
        while (i <= n) {
            sumWhile += i;
            i++;
        }

        // Sum using formula
        int sumFormula = n * (n + 1) / 2;

        // Display both results
        System.out.println("Sum using while loop: " + sumWhile);
        System.out.println("Sum using formula: " + sumFormula);

        // Compare the two results
        if (sumWhile == sumFormula) {
            System.out.println("Both results are equal. Computation is correct.");
        } else {
            System.out.println("Results do not match. Check the logic.");
        }
    }
}
