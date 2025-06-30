import java.util.*;

class MovieTicket {
    // Attributes
    String movieName;
    String seatNumber;
    double price;

    // Constructor (default empty ticket)
    MovieTicket() {
        movieName = "";
        seatNumber = "";
        price = 0.0;
    }

    // Method to book a ticket (assign seat and price)
    void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    // Method to display ticket details
    void displayTicket() {
        if (!movieName.isEmpty()) {
            System.out.println("\n- Ticket Details -");
            System.out.println("Movie Name : " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price      : " + price);
        } else {
            System.out.println("No ticket booked yet.");
        }
    }
}

public class MovieTicketSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieTicket ticket = new MovieTicket();

        System.out.print("Enter movie name: ");
        String movieName = scanner.nextLine();

        System.out.print("Enter seat number (e.g., A10): ");
        String seatNumber = scanner.nextLine();

        System.out.print("Enter ticket price: ");
        double price = scanner.nextDouble();

        // Book the ticket
        ticket.bookTicket(movieName, seatNumber, price);

        // Display the booked ticket
        ticket.displayTicket();

    }
}
