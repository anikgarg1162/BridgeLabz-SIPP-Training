public class NullPointerDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;

        // throw NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;
        try {
            // Attempt to access method on null
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            // Handle the exception
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    // Main method to demonstrate both
    public static void main(String[] args) {
        System.out.println("Demonstrating exception:");
        // First call the method that generates the exception
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception occurred in generateException(): " + e.getMessage());
        }

        System.out.println("\nHandling exception safely:");
        // Then call the method that handles the exception
        handleException();
    }
}
