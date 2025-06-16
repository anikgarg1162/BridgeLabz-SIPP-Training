import java.util.Scanner;

public class LargestNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a >= b && a >= c) {
            System.out.println("Is the first number the largest? true");
            System.out.println("Is the second number the largest? false");
            System.out.println("Is the third number the largest? false");
        } else if (b >= a && b >= c) {
            System.out.println("Is the first number the largest? false");
            System.out.println("Is the second number the largest? true");
            System.out.println("Is the third number the largest? false");
        } else {
            System.out.println("Is the first number the largest? false");
            System.out.println("Is the second number the largest? false");
            System.out.println("Is the third number the largest? true");
        }
    }
}
