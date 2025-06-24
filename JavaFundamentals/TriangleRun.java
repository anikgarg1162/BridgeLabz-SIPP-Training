import java.util.Scanner;

public class TriangleRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1 in meters: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2 in meters: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3 in meters: ");
        double side3 = scanner.nextDouble();

        // Calculate perimeter of triangle
        double perimeter = side1 + side2 + side3;

        // Total distance to run in meters (5 km = 5000 meters)
        double totalDistance = 5000;

        // Calculate number of rounds
        double rounds = totalDistance / perimeter;

        // Output result
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");

    }
}
