import java.util.*;

class Item {
    // Attributes
    int itemCode;
    String itemName;
    double price;

    // Constructor to initialize 
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // display item details
    void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: ₹" + price);
    }

    // calculate total cost for given quantity
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class InventoryTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter item code: ");
        int code = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter item name: ");
        String name = scanner.nextLine();

        System.out.print("Enter item price: ");
        double price = scanner.nextDouble();

        // Create object
        Item item = new Item(code, name, price);

        System.out.print("Enter quantity to purchase: ");
        int quantity = scanner.nextInt();

        System.out.println("\n--- Item Details ---");
        item.displayItemDetails();
        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " units: ₹" + totalCost);
    }
}
