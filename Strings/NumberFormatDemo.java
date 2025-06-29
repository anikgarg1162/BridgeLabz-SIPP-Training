import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate NumberFormatException 
    public static void generateException(String input) {
        // This will throw NumberFormatException if input is not a valid number
        int number = Integer.parseInt(input);
        System.out.println("Parsed number: " + number);
    }

    // Method to handle NumberFormatException using try-catch
    public static void handleException(String input) {
        try {
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (or text to generate error): ");
        String input = sc.nextLine();

        System.out.println("\nCalling generateException():");
        try {
            generateException(input);
        } catch (NumberFormatException e) {
            System.out.println("Caught in main (NumberFormatException): " + e.getMessage());
        }

        System.out.println("\nCalling handleException():");
        handleException(input);

    }
}
