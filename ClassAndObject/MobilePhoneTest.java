import java.util.*;

class MobilePhone {
    // Attributes
    String brand;
    String model;
    double price;

    // Constructor
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // display phone details
    void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : ₹" + price);
    }
}

public class MobilePhoneTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter phone brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter phone model: ");
        String model = scanner.nextLine();

        System.out.print("Enter phone price: ");
        double price = scanner.nextDouble();

        // Create object
        MobilePhone phone = new MobilePhone(brand, model, price);

        phone.displayDetails();
    }
}
