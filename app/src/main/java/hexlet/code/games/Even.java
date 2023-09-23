package hexlet.code.games;

import java.util.Scanner;

public class Even {

    public static void start(String name) {

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);

        int minNumber = 1;
        int maxNumber = 100;
        int countWrightTake = 0;

        while (countWrightTake < 3) {
            var randomNumber = (int) (Math.random() * maxNumber + minNumber);
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
        if (countWrightTake != 0) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
