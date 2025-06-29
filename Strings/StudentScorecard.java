import java.util.Random;

public class StudentScorecard {

    // Generate random 2-digit scores for N students
    public static int[][] generateMarks(int numberOfStudents) {
        Random rand = new Random();
        int[][] marks = new int[numberOfStudents][3]; // [][0]=Physics, [][1]=Chem, [][2]=Maths

        for (int i = 0; i < numberOfStudents; i++) {
            marks[i][0] = rand.nextInt(41) + 60; // 60-100 range
            marks[i][1] = rand.nextInt(41) + 60;
            marks[i][2] = rand.nextInt(41) + 60;
        }

        return marks;
    }

    // Calculate total, average, and percentage
    public static double[][] calculateStats(int[][] marks) {
        int n = marks.length;
        double[][] stats = new double[n][3]; // [][0]=total, [][1]=average, [][2]=percentage

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            stats[i][0] = total;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(percent * 100.0) / 100.0;
        }

        return stats;
    }

    // Calculate grade based on updated percentage criteria
    public static String[] calculateGrades(double[][] stats) {
        int n = stats.length;
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            double percent = stats[i][2];
            if (percent >= 80) grades[i] = "A";
            else if (percent >= 70) grades[i] = "B";
            else if (percent >= 60) grades[i] = "C";
            else if (percent >= 50) grades[i] = "D";
            else if (percent >= 40) grades[i] = "E";
            else grades[i] = "R";
        }

        return grades;
    }

    // Return remarks based on grade
    public static String getRemarks(String grade) {
        switch (grade) {
            case "A":
                return "Level 4, above agency-normalized standards";
            case "B":
                return "Level 3, at agency-normalized standards";
            case "C":
                return "Level 2, below but approaching standards";
            case "D":
                return "Level 1, well below standards";
            case "E":
                return "Level 1-, too below standards";
            case "R":
                return "Remedial standards";
            default:
                return "";
        }
    }

    // Display the scorecard
    public static void displayScorecard(int[][] marks, double[][] stats, String[] grades) {
        System.out.println("Student\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade\tRemarks");
        System.out.println("----------------------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            String grade = grades[i];
            String remarks = getRemarks(grade);

            System.out.println("S" + (i + 1) + "\t" +
                    marks[i][0] + "\t" +
                    marks[i][1] + "\t" +
                    marks[i][2] + "\t" +
                    (int) stats[i][0] + "\t" +
                    stats[i][1] + "\t" +
                    stats[i][2] + "\t" +
                    grade + "\t" + remarks);
        }
    }

    // Main method
    public static void main(String[] args) {
        int numberOfStudents = 5; 

        int[][] marks = generateMarks(numberOfStudents);
        double[][] stats = calculateStats(marks);
        String[] grades = calculateGrades(stats);

        displayScorecard(marks, stats, grades);
    }
}
