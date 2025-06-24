import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert to Fahrenheit using the formula
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Output
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");

    }
}
