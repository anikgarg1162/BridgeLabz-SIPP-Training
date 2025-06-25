import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age of Amar: ");
        int ageAmar = scanner.nextInt();
        System.out.print("Enter height of Amar (in cm): ");
        int heightAmar = scanner.nextInt();

        System.out.print("Enter age of Akbar: ");
        int ageAkbar = scanner.nextInt();
        System.out.print("Enter height of Akbar (in cm): ");
        int heightAkbar = scanner.nextInt();

        System.out.print("Enter age of Anthony: ");
        int ageAnthony = scanner.nextInt();
        System.out.print("Enter height of Anthony (in cm): ");
        int heightAnthony = scanner.nextInt();

        // Find youngest

        String youngest;
        int minAge = ageAmar;

        if (ageAkbar < minAge) {
            minAge = ageAkbar;
            youngest = "Akbar";
        } else {
            youngest = "Amar";
        }

        if (ageAnthony < minAge) {
            minAge = ageAnthony;
            youngest = "Anthony";
        }

        // Find tallest

        String tallest;
        int maxHeight = heightAmar;

        if (heightAkbar > maxHeight) {
            maxHeight = heightAkbar;
            tallest = "Akbar";
        } else {
            tallest = "Amar";
        }

        if (heightAnthony > maxHeight) {
            maxHeight = heightAnthony;
            tallest = "Anthony";
        }

        // Display results

        System.out.println("\nThe youngest friend is: " + youngest + " (" + minAge + " years)");
        System.out.println("The tallest friend is: " + tallest + " (" + maxHeight + " cm)");
    }
}
