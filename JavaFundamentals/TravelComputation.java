import java.util.Scanner;

public class TravelComputation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter traveler name: ");
        String name = scanner.nextLine();

        System.out.print("Enter starting city (fromCity): ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter via city (viaCity): ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter destination city (toCity): ");
        String toCity = scanner.nextLine();

        // Input distances (in kilometers)

        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " in km: ");
        double distanceFromToVia = scanner.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + " in km: ");
        double distanceViaToFinalCity = scanner.nextDouble();

        // Input time (in minutes)

        System.out.print("Enter time taken from " + fromCity + " to " + viaCity + " in minutes: ");
        int timeFromToVia = scanner.nextInt();

        System.out.print("Enter time taken from " + viaCity + " to " + toCity + " in minutes: ");
        int timeViaToFinalCity = scanner.nextInt();

        // Compute total distance and total time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

   
        System.out.println("The Total Distance travelled by " + name + " from " +
                           fromCity + " to " + toCity + " via " + viaCity +
                           " is " + totalDistance + " km and the Total Time taken is " +
                           totalTime + " minutes");

    }
}
