import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        number = Math.abs(number);

        // Count digits
        int temp = number;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        // Store digits in array
        int[] digits = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Display digits in reverse order
        System.out.print("Reversed digits: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i] + " ");
        }

    }
}
