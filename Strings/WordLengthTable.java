import java.util.Scanner;

public class WordLengthTable {

    // Split the sentence into words using charAt()
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
            allWords.append(word);
        }

        return allWords.toString().split(",");
    }

    // Get length of a string without using length()
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // reached end of string
        }
        return count;
    }

    // Create a 2D array with word and its length (as String)
    public static String[][] getWordsWithLengths(String[] words) {
        int len = getLength(words);
        String[][] result = new String[len][2];

        for (int i = 0; i < len; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = splitWords(input);
        String[][] wordTable = getWordsWithLengths(words);

        System.out.println("\nWord\t\tLength");
        System.out.println("-----------------------");
        for (int i = 0; i < getLength(wordTable); i++) {
            String word = wordTable[i][0];
            int len = Integer.parseInt(wordTable[i][1]);
            System.out.println(word + "\t\t" + len);
        }

    }
}
