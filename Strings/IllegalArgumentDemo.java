import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String text) {
        // This will throw IllegalArgumentException at runtime
        System.out.println("Generated Substring: " + text.substring(5, 2)); // invalid indices
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String text) {
        try {
            // Intentionally setting wrong indices to generate exception
            System.out.println("Handled Substring: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("\nCalling generateException():");
        try {
            generateException(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught in main (IllegalArgumentException): " + e.getMessage());
        }

        
        System.out.println("\nCalling handleException():");
        handleException(input);
    }
}
