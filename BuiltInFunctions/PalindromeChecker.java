import java.util.Scanner;

public class PalindromeChecker {

    // Function to take input from user
    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        return input;
    }

    // Function to check if input is a palindrome
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s", "").toLowerCase(); 
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Function to display result
    public static void displayResult(String input, boolean result) {
        if (result) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }
    }

    // Main method
    public static void main(String[] args) {
        String input = getInput();
        boolean result = isPalindrome(input);
        displayResult(input, result);
    }
}
