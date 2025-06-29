import java.util.Scanner;

public class ToggleCase {

    // Method to toggle case
    public static String toggleCase(String text) {
        StringBuilder toggled = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isUpperCase(ch)) {
                toggled.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggled.append(Character.toUpperCase(ch));
            } else {
                toggled.append(ch); 
            }
        }

        return toggled.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = toggleCase(input);

        System.out.println("Toggled case string: " + result);

        sc.close();
    }
}
