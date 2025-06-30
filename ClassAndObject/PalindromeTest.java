import java.util.*;

class PalindromeChecker {
    String text;

    // Constructor
    PalindromeChecker(String text) {
        this.text = text;
    }

    // check if the text is a palindrome
    boolean isPalindrome() {
        String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // display the result
    void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
}

public class PalindromeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text to check for palindrome: ");
        String inputText = sc.nextLine();

        // Create object
        PalindromeChecker checker = new PalindromeChecker(inputText);

        // Display result
        checker.displayResult();
    }
}
