import java.util.Random;
import java.util.Scanner;

public class VotingEligibilityChecker {

    // Generate random 2-digit ages for n students
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(100); 
        }
        return ages;
    }

    // Determine voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        int n = ages.length;
        String[][] results = new String[n][2];

        for (int i = 0; i < n; i++) {
            int age = ages[i];
            results[i][0] = String.valueOf(age);

            if (age < 0) {
                results[i][1] = "Invalid";
            } else if (age >= 18) {
                results[i][1] = "Can Vote";
            } else {
                results[i][1] = "Cannot Vote";
            }
        }

        return results;
    }

    // Display 2D array in tabular format
    public static void displayResults(String[][] results) {
        System.out.println("Student\tAge\tEligibility");
        System.out.println("-----------------------------");

        for (int i = 0; i < results.length; i++) {
            System.out.println("S" + (i + 1) + "\t" + results[i][0] + "\t" + results[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);
        String[][] eligibilityResults = checkVotingEligibility(ages);
        displayResults(eligibilityResults);

        sc.close();
    }
}
