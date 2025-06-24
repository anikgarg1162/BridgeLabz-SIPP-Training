import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter value for c: ");
        double c = scanner.nextDouble();

        double result1 = a + b * c;      // Multiplication before addition
        double result2 = a * b + c;      // Multiplication before addition
        double result3 = c + a / b;      // Division before addition
        double result4 = a % b + c;      // Modulus before addition

        System.out.println(
            "The results of Double Operations are:\n" +
            "a + b * c = " + result1 + "\n" +
            "a * b + c = " + result2 + "\n" +
            "c + a / b = " + result3 + "\n" +
            "a % b + c = " + result4
        );

    }
}
