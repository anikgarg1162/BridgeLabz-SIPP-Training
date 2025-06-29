import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate the exception (no handling)
    public static void generateException(String text) {
        // This will cause StringIndexOutOfBoundsException if index >= text.length()
        System.out.println("Character at index 10: " + text.charAt(10));
    }

    // Method to handle the exception using try-catch
    public static void handleException(String text) {
        try {
            System.out.println("Character at index 10: " + text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
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
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught in main (StringIndexOutOfBoundsException): " + e.getMessage());
        }

        System.out.println("\nCalling handleException():");
        handleException(input);

    }
}
