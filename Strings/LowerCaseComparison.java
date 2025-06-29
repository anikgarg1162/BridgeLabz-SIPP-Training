import java.util.Scanner;

public class LowerCaseComparison {

    // Convert to lowercase using ASCII logic
    public static String convertToLowerCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32); // Convert to lowercase
            }

            result.append(ch);
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
        String input = sc.nextLine();

        String builtInLower = input.toLowerCase();

        String customLower = convertToLowerCase(input);

        boolean isSame = compareStrings(builtInLower, customLower);

        System.out.println("\nBuilt-in toLowerCase(): " + builtInLower);
        System.out.println("Custom toLowerCase():   " + customLower);
        System.out.println("Are both results same?  " + isSame);
    }
}
