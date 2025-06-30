import java.util.*;

class Student {
    // Attributes
    String name;
    int rollNumber;
    double marks;

    // Constructor
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // calculate grade based on marks
    String calculateGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }

    // display student details and grade
    void displayReport() {
        System.out.println("\n-- Student Report --");
        System.out.println("Name       : " + name);
        System.out.println("Roll No.   : " + rollNumber);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + calculateGrade());
    }
}

public class StudentReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();

        System.out.print("Enter marks (out of 100): ");
        double marks = scanner.nextDouble();

        // Create object and display report
        Student student = new Student(name, rollNumber, marks);
        student.displayReport();
    }
}
