import java.util.*;

class Circle {
    double radius;

    // Constructor to initialize
    Circle(double radius) {
        this.radius = radius;
    }

    // calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // calculate circumference
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display 
    void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}

public class CircleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius : ");
        double radius = sc.nextDouble();

        // Create object
        Circle circle = new Circle(radius);

        circle.displayDetails();

    }
}
