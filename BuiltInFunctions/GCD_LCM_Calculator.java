import java.util.Scanner;

public class GCD_LCM_Calculator {

    // Function to take input
    public static int[] getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        return new int[]{a, b};
    }

    // Function to calculate GCD using Euclidean Algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM using GCD
    public static int lcm(int a, int b) {
        return (a * b) 
    }

    // Function to display results
    public static void displayResult(int a, int b, int gcdValue, int lcmValue) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcdValue);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcmValue);
    }

    // Main method
    public static void main(String[] args) {
        int[] input = getInput();
        int a = input[0];
        int b = input[1];

        int gcdValue = gcd(a, b);
        int lcmValue = lcm(a, b);

        displayResult(a, b, gcdValue, lcmValue);
    }
}
