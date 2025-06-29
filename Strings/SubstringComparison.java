import java.util.Scanner;

public class SubstringComparison {

    // Create substring using charAt()
    public static String customSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();

        for (int i = start; i < end && i < text.length(); i++) {
            result.append(text.charAt(i));
        }

        return result.toString();
    }

    // Compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = sc.next(); // takes single word

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String builtInSubstring = "";
        if (start >= 0 && end <= text.length() && start < end) {
            builtInSubstring = text.substring(start, end);
        } else {
            System.out.println("Invalid indices for substring()");
        }

        String customSub = customSubstring(text, start, end);

        
        boolean areSame = compareStrings(builtInSubstring, customSub);

        System.out.println("\nBuilt-in substring: " + builtInSubstring);
        System.out.println("Custom substring:   " + customSub);
        System.out.println("Are both substrings same? " + areSame);

        
    }
}
