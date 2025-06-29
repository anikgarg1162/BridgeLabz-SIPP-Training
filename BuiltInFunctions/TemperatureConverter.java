import java.util.Scanner;

public class TemperatureConverter {

    // Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose option (1 or 2): ");
        int option = sc.nextInt();

        if (option == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double c = sc.nextDouble();
            double f = celsiusToFahrenheit(c);
            System.out.printf("%.2f°C = %.2f°F\n", c, f);
        } else if (option == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double f = sc.nextDouble();
            double c = fahrenheitToCelsius(f);
            System.out.printf("%.2f°F = %.2f°C\n", f, c);
        } else {
            System.out.println("Invalid option!");
        }
    }
}
