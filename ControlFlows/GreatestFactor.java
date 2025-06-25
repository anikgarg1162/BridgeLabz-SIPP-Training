import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("Enter a number greater than 1 to find its greatest factor.");
            return;
        }

        int greatestFactor = 1;
        int counter = number - 1;

        // Loop downwards to find the greatest factor
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;  // Stop as soon as we find the greatest factor
            }
            counter--;
        }

        // Display the result
        System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
    }
}
