import java.util.Scanner;

public class QuizGrader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char gradeAnotherQuiz;

        do {
            System.out.print("Enter the number of questions in the quiz: ");
            int numQuestions = scanner.nextInt();

            System.out.println("Enter the key for the quiz (space-separated integers): ");
            int[] key = new int[numQuestions];
            for (int i = 0; i < numQuestions; i++) {
                key[i] = scanner.nextInt();
            }

            System.out.println("Enter the answers for the quiz (space-separated integers): ");
            int numCorrect = 0;
            for (int i = 0; i < numQuestions; i++) {
                int userAnswer = scanner.nextInt();

                if (userAnswer == key[i]) {
                    numCorrect++;
                }
            }

            double percentCorrect = (double) numCorrect / numQuestions * 100;
            System.out.println("correct: " + numCorrect);
            System.out.println("Percent correct: " + percentCorrect + "%");

            System.out.print("Grade another quiz? (y/n): ");
            gradeAnotherQuiz = scanner.next().charAt(0);

        } while (gradeAnotherQuiz == 'y' || gradeAnotherQuiz == 'Y');
    }
}
