import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your numerical score: ");
        int score = scanner.nextInt();

        char grade;
        if (score >= 80) {
            grade = 'A';
        } else if (score >= 70) {
            grade = 'B';
        } else if (score >= 60) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("Your grade is: " + grade);
        scanner.close();
    }
}