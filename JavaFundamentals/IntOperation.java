import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();

        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();

        System.out.print("Enter value for c: ");
        int c = scanner.nextInt();

        int result1 = a + b * c;      // b * c first, then + a
        int result2 = a * b + c;      // a * b first, then + c
        int result3 = c + a / b;      // a / b first, then + c
        int result4 = a % b + c;      // a % b first, then + c

        System.out.println(
            "The results of Int Operations are: " +
            "a + b * c = " + result1 + "\n" +
            "a * b + c = " + result2 + "\n" +
            "c + a / b = " + result3 + "\n" +
            "a % b + c = " + result4
        );

    }
}
