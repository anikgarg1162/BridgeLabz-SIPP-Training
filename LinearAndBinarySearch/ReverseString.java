import java.util.*;
public class ReverseString {
    public static String reverse(String input) {
        
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String original = sc.nextLine();
        String reversed = reverse(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
