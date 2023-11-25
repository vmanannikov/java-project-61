package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String answer;
    private static String userName;

    private static final int TAKES_COUNT = 3;
    public static void startEngine(String description, String[][] data) {

        int correctCount = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = sc.next();
        System.out.println("Hello, " + userName + "!");

        System.out.print(description);
        System.out.println();

        for (int i = 0; i < TAKES_COUNT; i++) {

            System.out.print("Question: " + data[i][0]);
            System.out.println();

            System.out.print("Your answer: ");
            answer = sc.next();

            if (!answer.equals(data[i][1])) {
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
            sc.close();
        }
    }

    public static int getRandomNumber(int minNumber, int maxNumber) {
        return (int) (Math.random() * maxNumber + minNumber);
    }
}
