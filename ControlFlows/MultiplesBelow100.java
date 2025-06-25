import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer less than 100: ");
        int number = scanner.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a valid number (greater than 0 and less than 100).");
            return;
        }

        System.out.println("Multiples of " + number + " below 100 are:");

        // Initialize counter
        int counter = 1;

        // Loop to find multiples
        while (number * counter < 100) {
            System.out.println(number * counter);
            counter++;
        }
    }
}
