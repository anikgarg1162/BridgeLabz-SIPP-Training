import java.util.*;

public class StringCharComparison {

    public static char[] getCharacters(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        char[] customCharArray = getCharacters(input);
        char[] builtInCharArray = input.toCharArray();
        boolean areEqual = compareCharArrays(customCharArray, builtInCharArray);

        System.out.println("\nCustom method output:");
        System.out.println(Arrays.toString(customCharArray));

        System.out.println("Built-in toCharArray output:");
        System.out.println(Arrays.toString(builtInCharArray));

        System.out.println("\nAre both arrays equal? " + areEqual);
    }
}
