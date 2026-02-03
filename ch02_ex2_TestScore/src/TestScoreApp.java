import java.util.Scanner;

public class TestScoreApp {

    public static void main(String[] args) {
        // display operational messages
        System.out.println("Enter test scores that range from 0 to 100.");
        System.out.println("To end the program, enter 999.");
        System.out.println();  // print a blank line

        // initialize variables and create a Scanner object
        int scoreTotal = 0;
        int scoreCount = 0;
        int testScore = 0;
        double averageScore = 0.0;
        Scanner sc = new Scanner(System.in);

        // get a series of test scores from the user
        while (testScore != 999) {
            // get the input from the user
            System.out.print("Enter score: ");
            String input = sc.nextLine();
            testScore = Integer.parseInt(input);

            if (testScore == 999) {
                // end program
                break;
            }

            // accumulate score count and score total
            else if (testScore >= 0 && testScore <= 100) {
                scoreCount++;
                scoreTotal += testScore;
            } 
            else {
                System.out.println("Invalid entry; not counted");
            }
        }

        // calculate average only if at least one valid score was entered
        if (scoreCount > 0) {
            averageScore = (double) scoreTotal / scoreCount;
        }

        // display results
        System.out.println();
        System.out.println("Score count:   " + scoreCount);
        System.out.println("Score total:   " + scoreTotal);
        System.out.println("Average score: " + averageScore);
    }
}