import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        double distanceInYards = distanceInFeet / 3.0;
        double distanceInMiles = distanceInYards / 1760.0;

        System.out.println(
            "The distance in yards is " + String.format("%.2f", distanceInYards) +
            " while the distance in miles is " + String.format("%.5f", distanceInMiles)
        );

    }
}
