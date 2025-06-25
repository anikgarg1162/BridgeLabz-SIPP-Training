public class DayOfWeek {
    public static void main(String[] args) {

        if (args.length < 3) {
            System.out.println("Please provide month (m), day (d), and year (y) as command-line arguments.");
            return;
        }

        int m = Integer.parseInt(args[0]); // Month
        int d = Integer.parseInt(args[1]); // Day
        int y = Integer.parseInt(args[2]); // Year

        // Adjust month and year for Zeller’s formula
        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int k = y % 100;       // year of the century
        int j = y / 100;       // zero-based century

        // Apply Zeller's Congruence formula
        int dayOfWeek = (d + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        // Map Zeller’s output to standard format (0 = Sunday)
        int day = (dayOfWeek + 6) % 7;

        // Print result
        System.out.println("Day of the week (0=Sunday, 1=Monday,...): " + day);
    }
}
