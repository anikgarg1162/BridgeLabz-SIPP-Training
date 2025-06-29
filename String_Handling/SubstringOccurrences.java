import java.util.Scanner;

public class SubstringOccurrences {

    // Method to count occurrences of substring
    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0;
        int index = 0;

        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length(); // Move index to after current match
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainStr = sc.nextLine();

        System.out.print("Enter the substring to find: ");
        String subStr = sc.nextLine();

        int occurrences = countOccurrences(mainStr, subStr);

        System.out.println("The substring \"" + subStr + "\" occurs " + occurrences + " time(s).");
    }
}
