import java.util.Scanner;

public class CustomTrimDemo {

    // Method to find the start and end index without leading/trailing spaces
    public static int[] findTrimIndices(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Find the first non-space character
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Find the last non-space character
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1}; 
    }

    // Method to extract substring using charAt()
    public static String customSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();

        for (int i = start; i < end; i++) {
            result.append(text.charAt(i));
        }

        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

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

        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = sc.nextLine();

        String builtInTrim = input.trim();


        int[] indices = findTrimIndices(input);
        String customTrim = customSubstring(input, indices[0], indices[1]);

        boolean isSame = compareStrings(builtInTrim, customTrim);

        System.out.println("\nBuilt-in trim():      '" + builtInTrim + "'");
        System.out.println("Custom trim (charAt): '" + customTrim + "'");
        System.out.println("Are both results same? " + isSame);
    }
}
