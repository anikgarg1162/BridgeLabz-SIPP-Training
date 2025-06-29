import java.util.Scanner;

public class MostFrequentCharacter {

    // Method to find the most frequent character
    public static char findMostFrequentChar(String text) {
        int[] freq = new int[256]; 

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        int max = 0;
        char mostFrequent = ' ';

        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] > max) {
                max = freq[text.charAt(i)];
                mostFrequent = text.charAt(i);
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char result = findMostFrequentChar(input);

        System.out.println("Most Frequent Character: '" + result + "'");

        sc.close();
    }
}
