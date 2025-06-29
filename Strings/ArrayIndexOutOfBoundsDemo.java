import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate the exception 
    public static void generateException(String[] names) {
        // Trying to access index beyond the array length
        System.out.println("Accessing name at index 5: " + names[5]);
    }

    // Method to handle the exception using try-catch
    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing name at index 5: " + names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int size = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] names = new String[size];
        System.out.println("Enter " + size + " names:");

        for (int i = 0; i < size; i++) {
            names[i] = sc.nextLine();
        }

        System.out.println("\nCalling generateException():");
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught in main (ArrayIndexOutOfBoundsException): " + e.getMessage());
        }

        System.out.println("\nCalling handleException():");
        handleException(names);

    }
}
