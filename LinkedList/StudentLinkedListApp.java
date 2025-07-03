import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    int age;
    char grade;
    Student next;

    Student(int rollNumber, String name, int age, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentList {
    Student head = null;

    // Add at beginning
    void addAtBeginning(int roll, String name, int age, char grade) {
        Student newStudent = new Student(roll, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    // Add at end
    void addAtEnd(int roll, String name, int age, char grade) {
        Student newStudent = new Student(roll, name, age, grade);
        if (head == null) {
            head = newStudent;
            return;
        }
        Student temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newStudent;
    }

    // Add at position
    void addAtPosition(int pos, int roll, String name, int age, char grade) {
        if (pos <= 0) {
            System.out.println("Invalid position.");
            return;
        }
        Student newStudent = new Student(roll, name, age, grade);
        if (pos == 1) {
            newStudent.next = head;
            head = newStudent;
            return;
        }
        Student temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range.");
            return;
        }
        newStudent.next = temp.next;
        temp.next = newStudent;
    }

    // Search by Roll Number
    void searchByRoll(int roll) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == roll) {
                System.out.println("Found: " + temp.rollNumber + " " + temp.name + " " + temp.age + " " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    // Update grade by Roll Number
    void updateGrade(int roll, char newGrade) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == roll) {
                temp.grade = newGrade;
                System.out.println("Grade updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Roll number not found.");
    }

    // Display all students
    void displayAll() {
        if (head == null) {
            System.out.println("No records to display.");
            return;
        }
        Student temp = head;
        System.out.println("Student Records:");
        while (temp != null) {
            System.out.println("Roll: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }
}

public class StudentLinkedListApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList sl = new StudentList();

        // Add some students directly
        sl.addAtBeginning(101, "Anik", 21, 'A');
        sl.addAtEnd(102, "Amar", 21, 'B');
        sl.addAtPosition(2, 103, "Ankit", 22, 'C');

        // Display all students
        System.out.println("\n--- Display All Students ---");
        sl.displayAll();

        // Search for a student
        System.out.println("\n--- Search for Student with Roll 102 ---");
        sl.searchByRoll(102);

        // Update grade
        System.out.println("\n--- Update Grade for Roll 101 to 'A+' ---");
        sl.updateGrade(101, 'A');

        // Final display
        System.out.println("\n--- Final Student Records ---");
        sl.displayAll();

        sc.close();
    }
}
