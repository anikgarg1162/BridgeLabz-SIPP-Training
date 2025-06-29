import java.util.Scanner;

public class VowelConsonantCounter {

    // Method to check character type
    public static String checkCharType(char ch) {
        // Convert to lowercase using ASCII 
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); 
        }

        // Check if it is a letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to count vowels and consonants using charAt()
    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String type = checkCharType(ch);

            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] result = countVowelsAndConsonants(input);

        System.out.println("\nTotal Vowels: " + result[0]);
        System.out.println("Total Consonants: " + result[1]);

    }
}
