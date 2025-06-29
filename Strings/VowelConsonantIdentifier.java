import java.util.Scanner;

public class VowelConsonantIdentifier {

    // Method to check character type
    public static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); // A-Z to a-z
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to analyze each character and return 2D array
    public static String[][] analyzeCharacters(String text) {
        int length = text.length();
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharType(ch);
        }

        return result;
    }

    // Display 2D array in tabular format
    public static void displayCharacterAnalysis(String[][] table) {
        System.out.println("\nCharacter\tType");
        System.out.println("-------------------------");

        for (int i = 0; i < table.length; i++) {
            System.out.println("   " + table[i][0] + "\t\t" + table[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] analysis = analyzeCharacters(input);
        displayCharacterAnalysis(analysis);

    }
}
