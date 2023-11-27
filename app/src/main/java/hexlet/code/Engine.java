package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int TAKES_COUNT = 3;
    private static final int QUESTION = 0;
    private static final int ANSWER = 1;
    public static void start(String description, String[][] data) {
        String answer;
        String userName;

        int correctCount = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = sc.next();
        System.out.println("Hello, " + userName + "!");

        System.out.print(description);
        System.out.println();

        for (int i = 0; i < TAKES_COUNT; i++) {

            System.out.print("Question: " + data[i][QUESTION]);
            System.out.println();

            System.out.print("Your answer: ");
            answer = sc.next();

            if (!answer.equals(data[i][ANSWER])) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + data[i][1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            } else {
                correctCount++;
                System.out.println("Correct!");
            }
        }

        if (correctCount == TAKES_COUNT) {
            System.out.print("Congratulations, " + userName + "!");
            System.out.println();
        }
        sc.close();
    }

    public static int getRandomNumber(int minNumber, int maxNumber) {
        return (int) (Math.random() * maxNumber + minNumber);
    }
}
