import java.util.Scanner;

public class Quiz{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define questions, options, and correct answers
        String[] questions = {
            "What is the capital of India?",
            "Which team wins 2024 IPL Trophy?",
            "How many times Chennai super kings wins IPL trophy?"
        };

        String[][] options = {
            {"1. Delhi", "2. Paris", "3. canaberra", "4. wellington"},
            {"1. RCB", "2. KKR", "3. CSK", "4. MI"},
            {"1. 4", "2. 8", "3. 7", "4. 5"}
        };

        int[] answers = {1,2,4}; // Correct answers (1-based index)

        int score = 0;

        // Quiz loop
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (1-4): ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong. The correct answer was option " + answers[i]);
            }
            System.out.println();
        }

        // Display final score
        System.out.println("Quiz Over!");
        System.out.println("Your final score is: " + score + "/" + questions.length);

        scanner.close();
    }
}
