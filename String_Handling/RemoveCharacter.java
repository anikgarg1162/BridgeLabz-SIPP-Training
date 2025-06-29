import java.util.Scanner;

public class RemoveCharacter {

    // Method to remove all occurrences 
    public static String removeChar(String text, char chToRemove) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != chToRemove) {
                result.append(text.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        System.out.print("Enter the character to remove: ");
        char ch = sc.next().charAt(0);

        String modified = removeChar(input, ch);

        System.out.println("Modified String: \"" + modified + "\"");
    }
}
