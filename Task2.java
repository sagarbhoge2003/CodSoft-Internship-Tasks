import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Student Grade Calculator!");

        // Initialize variables
        int totalSubjects;
        int totalMarks = 0;

        // Take input for the number of subjects
        System.out.print("Enter the number of subjects: ");
        totalSubjects = scanner.nextInt();

        // Take marks for each subject
        for (int i = 1; i <= totalSubjects; i++) {
            System.out.print("Enter marks for Subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();

            // Validate input marks (between 0 and 100)
            while (marks < 0 || marks > 100) {
                System.out.println("Invalid input! Marks should be between 0 and 100.");
                System.out.print("Enter marks for Subject " + i + " (out of 100): ");
                marks = scanner.nextInt();
            }

            // Accumulate total marks
            totalMarks += marks;
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / totalSubjects;

        // Display total marks and average percentage
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);

        // Calculate and display the grade
        String grade = calculateGrade(averagePercentage);
        System.out.println("Grade: " + grade);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate the grade based on the average percentage
    private static String calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A";
        } else if (averagePercentage >= 80) {
            return "B";
        } else if (averagePercentage >= 70) {
            return "C";
        } else if (averagePercentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
