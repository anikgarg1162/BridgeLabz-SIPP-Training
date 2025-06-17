import java.util.*;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nChecking numbers:");
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            System.out.print("Number " + num + " is ");

            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("positive and even.");
                } else {
                    System.out.println("positive and odd.");
                }
            } else if (num < 0) {
                System.out.println("negative.");
            } else {
                System.out.println("zero.");
            }
        }

        System.out.println("\nComparison of first and last elements:");
        if (numbers[0] == numbers[4]) {
            System.out.println("First and last elements are equal.");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("First element is greater than the last element.");
        } else {
            System.out.println("First element is less than the last element.");
        }
    }
}
