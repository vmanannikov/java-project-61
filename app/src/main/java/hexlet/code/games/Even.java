package hexlet.code.games;

import java.util.Scanner;

public class Even {

    public static void start(String name) {

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);

        final int MIN_NUMBER = 1;
        final int MAX_NUMBER = 100;
        int countWrightTake = 1;
        final int TAKES = 4;

        while (countWrightTake < TAKES) {
            var randomNumber = (int) (Math.random() * MAX_NUMBER + MIN_NUMBER);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            var answer = scanner.next();
            System.out.println();

            if (randomNumber % 2 == 0 && answer.equals("yes")
                || randomNumber % 2 != 0 && answer.equals("no")) {

                System.out.println("Correct!");
                System.out.println();
                countWrightTake++;

            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }

        System.out.println("Congratulations, " + name + "!");
    }
}
