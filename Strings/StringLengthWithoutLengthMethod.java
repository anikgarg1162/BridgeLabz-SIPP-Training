import java.util.Scanner;

public class StringLengthWithoutLengthMethod {

    // User-defined method to find length 
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);  
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Reached end of string
        }
        return count;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();

        int manualLength = findLength(input);
        int builtInLength = input.length();

        System.out.println("\nLength using custom method: " + manualLength);
        System.out.println("Length using built-in method: " + builtInLength);

    }
}
