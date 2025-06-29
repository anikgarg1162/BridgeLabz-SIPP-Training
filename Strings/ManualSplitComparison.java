import java.util.Scanner;

public class ManualSplitComparison {

    // Custom method to find length of a string
    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // do nothing
        }
        return count;
    }

    // Split text manually using charAt()
    public static String[] manualSplit(String text) {
        int length = getLength(text);
        int spaceCount = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int[] spaceIndexes = new int[spaceCount + 2]; 
        int idx = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }
        spaceIndexes[0] = -1;         
        spaceIndexes[idx] = length;   

        // Now extract words between indexes
        String[] words = new String[spaceCount + 1];
        for (int i = 0; i < words.length; i++) {
            StringBuilder word = new StringBuilder();
            for (int j = spaceIndexes[i] + 1; j < spaceIndexes[i + 1]; j++) {
                word.append(text.charAt(j));
            }
            words[i] = word.toString();
        }

        return words;
    }

    // Compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (getLength(arr1) != getLength(arr2)) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static int getLength(String[] arr) {
        int count = 0;
        try {
            while (true) {
                String temp = arr[count];
                count++;
            }
        } catch (Exception e) {
            // do nothing
        }
        return count;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] builtinSplit = input.split(" ");
        String[] manualSplit = manualSplit(input);

        System.out.println("\nWords using built-in split():");
        for (String word : builtinSplit) {
            System.out.println(word);
        }

        System.out.println("\nWords using manual split:");
        for (String word : manualSplit) {
            System.out.println(word);
        }

        boolean areEqual = compareArrays(builtinSplit, manualSplit);
        System.out.println("\nDo both methods give the same result? " + areEqual);
    }
}
