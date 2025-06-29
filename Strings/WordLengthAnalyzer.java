import java.util.Scanner;

public class WordLengthAnalyzer {

    // Split string into words using charAt() without split()
    public static String[] splitWords(String text) {
        StringBuilder word = new StringBuilder();
        StringBuilder allWords = new StringBuilder();

        for (int i = 0; i < getLength(text); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word.append(ch);
            } else {
                if (getLength(word.toString()) > 0) {
                    allWords.append(word).append(",");
                    word.setLength(0);
                }
            }
        }

        if (getLength(word.toString()) > 0) {
            allWords.append(word); // last word
        }

        return allWords.toString().split(",");
    }

    // Get length of string manually
    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // do nothing, end of string
        }
        return count;
    }

    // Create 2D array with words and their lengths
    public static String[][] createWordLengthArray(String[] words) {
        String[][] result = new String[getLength(words)][];

        for (int i = 0; i < getLength(words); i++) {
            int len = getLength(words[i]);
            result[i] = new String[]{words[i], String.valueOf(len)};
        }

        return result;
    }

    // Find shortest and longest word
    public static int[] findShortestLongest(String[][] wordLengths) {
        int minIndex = 0;
        int maxIndex = 0;
        int minLength = Integer.parseInt(wordLengths[0][1]);
        int maxLength = minLength;

        for (int i = 1; i < getLength(wordLengths); i++) {
            int len = Integer.parseInt(wordLengths[i][1]);
            if (len < minLength) {
                minLength = len;
                minIndex = i;
            }
            if (len > maxLength) {
                maxLength = len;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = splitWords(input);
        String[][] wordLengths = createWordLengthArray(words);
        int[] minMax = findShortestLongest(wordLengths);

        System.out.println("\nWords and their lengths:");
        for (int i = 0; i < getLength(wordLengths); i++) {
            System.out.println("Word: '" + wordLengths[i][0] + "' Length: " + wordLengths[i][1]);
        }

        System.out.println("\nShortest Word: '" + wordLengths[minMax[0]][0] + "'");
        System.out.println("Longest Word: '" + wordLengths[minMax[1]][0] + "'");
    }
}
