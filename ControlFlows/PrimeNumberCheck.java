import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println(number + " is NOT a Prime Number.");
            return;
        }

        // Initialize isPrime as true
        boolean isPrime = true;

        // Loop from 2 to number - 1
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break; // not a prime, exit the loop
            }
        }

        // Display the result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }
    }
}
