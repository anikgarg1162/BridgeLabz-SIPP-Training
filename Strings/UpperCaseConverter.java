import java.util.Scanner;

public class UpperCaseConverter {

    // Custom method to convert to uppercase
    public static String convertToUpperCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32); // Convert using ASCII difference
            }

            result.append(ch);
        }

        return result.toString();
    }

    // Custom method to compare two strings 
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text:");
        String input = sc.nextLine();

        String builtInUpper = input.toUpperCase();

        String customUpper = convertToUpperCase(input);

        boolean isSame = compareStrings(builtInUpper, customUpper);

        System.out.println("\nBuilt-in toUpperCase(): " + builtInUpper);
        System.out.println("Custom UpperCase:      " + customUpper);
        System.out.println("Are both results same? " + isSame);

        
    }
}
