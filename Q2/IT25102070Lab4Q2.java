import java.util.Scanner;

public class IT25102070Lab4Q2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get exam marks
        System.out.print("Please enter exam marks (out of 100): ");
        double examMarks = input.nextDouble();

        // Validate exam marks immediately
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            return;
        }

        // Get lab marks
        System.out.print("Please enter lab submission marks (out of 100): ");
        double labMarks = input.nextDouble();

        // Validate lab marks immediately
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            return;
        }

        // Get percentages
        System.out.print("Please enter the percentage given for the exam: ");
        double examPercentage = input.nextDouble();

        System.out.print("Please enter the percentage given for the lab submission: ");
        double labPercentage = input.nextDouble();

        // Validate percentages
        if (examPercentage + labPercentage != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            return;
        }

        // Calculate final mark
        double finalMark =
                (examMarks * examPercentage / 100) +
                (labMarks * labPercentage / 100);

        System.out.println();
        System.out.println("Final Exam Mark is : " + finalMark);
		
		input.close();
    }
}