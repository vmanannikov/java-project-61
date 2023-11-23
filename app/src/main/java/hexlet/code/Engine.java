package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String answer;
    public static String userName;
    public static void startEngine(String description, String[][] data) {

        int correctCount = 0;

        Scanner scanner = new Scanner(System.in);

        welcomeUser(scanner);

        printRule(description);

        for (int i = 0; i < 3; i++) {
            printQuestion(data[i][0]);
            printAnswer(scanner);
            if (!answer.equals(data[i][1])) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + data[i][1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            } else {
                correctCount++;
                System.out.println("Correct!");
            }
        }

        if (correctCount == 3) {
            printCongratulation();
            scanner.close();
        }
    }

    public static int getRandomNumber(int minNumber, int maxNumber) {
        return (int) (Math.random() * maxNumber + minNumber);
    }

    public static void welcomeUser(Scanner sc) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = sc.next();
        System.out.println("Hello, " + userName + "!");
    }

    public static void printQuestion(String question) {
        System.out.print("Question: " + question);
        System.out.println();
    }

    public static void printRule(String rule) {
        System.out.print(rule);
        System.out.println();
    }

    public static void printAnswer(Scanner sc) {
        System.out.print("Your answer: ");
        answer = sc.next();
    }

    public static void printCongratulation() {
        System.out.print("Congratulations, " + userName + "!");
        System.out.println();
    }
}
