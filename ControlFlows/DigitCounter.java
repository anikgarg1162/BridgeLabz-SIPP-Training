import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Handle negative numbers
        number = Math.abs(number);

        // Initialize count
        int count = 0;

        if (number == 0) {
            count = 1;
        } else {
            // Step 3-5: Loop until number becomes 0
            while (number != 0) {
                number = number / 10;  // Step 4: Remove last digit
                count++;               // Step 5: Increase count
            }
        }

        // Display the count
        System.out.println("Number of digits: " + count);

    }
}
