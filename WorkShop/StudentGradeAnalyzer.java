import java.util.*;

public class StudentGradeAnalyzer {

    static class Student {
        String name;
        int id;
        Integer[] grades;

        Student(String name, int id, Integer[] grades) {
            this.name = name;
            this.id = id;
            this.grades = grades;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        System.out.print("Enter number of subjects: ");
        int m = scanner.nextInt();

        Student[] students = inputStudentData(scanner, n, m);
        printStudentTotalsAndAverages(students);
        printHighestGradeInEachSubject(students, m);
        printOverallClassAverage(students);
    }

    // Method 1: Input student data
    public static Student[] inputStudentData(Scanner scanner, int n, int m) {
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            scanner.nextLine(); // Clear buffer
            System.out.println("\nEnter details for student " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("ID: ");
            int id = scanner.nextInt();

            Integer[] grades = new Integer[m];

            for (int j = 0; j < m; j++) {
                System.out.print("Enter grade for Subject " + (j + 1) + ": ");
                try {
                    int grade = scanner.nextInt();
                    if (grade < 0 || grade > 100) {
                        throw new IllegalArgumentException("Grade must be between 0 and 100.");
                    }
                    grades[j] = grade;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next(); // clear the bad input
                    j--; // retry this subject
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    j--; // retry this subject
                }
            }

            students[i] = new Student(name, id, grades);
        }

        return students;
    }

    // Method 2: Calculate and print total & average for each student
    public static void printStudentTotalsAndAverages(Student[] students) {
        for (Student student : students) {
            int total = 0, count = 0;
            for (Integer grade : student.grades) {
                if (grade != null) {
                    total += grade;
                    count++;
                }
            }
            double average = (count > 0) ? (double) total / count : 0;
            System.out.println("\nStudent: " + student.name + ", ID: " + student.id);
            System.out.println("Total: " + total + ", Average: " + average);
        }
    }

    // Method 3: Find and print highest grade in each subject
    public static void printHighestGradeInEachSubject(Student[] students, int subjectCount) {
        for (int j = 0; j < subjectCount; j++) {
            int highest = -1;
            for (Student student : students) {
                if (student.grades[j] != null && student.grades[j] > highest) {
                    highest = student.grades[j];
                }
            }
            System.out.println("Highest grade in Subject " + (j + 1) + ": " + highest);
        }
    }

    // Method 4: Calculate and print overall class average
    public static void printOverallClassAverage(Student[] students) {
        int sum = 0, totalCount = 0;
        for (Student student : students) {
            for (Integer grade : student.grades) {
                if (grade != null) {
                    sum += grade;
                    totalCount++;
                }
            }
        }

        double classAverage = (totalCount > 0) ? (double) sum / totalCount : 0;
        System.out.println("Overall class average: " + classAverage);
    }
}
