package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit\n"
                + "Your choice: ");
        var gameNumber = scanner.nextInt();
        System.out.println();

        switch (gameNumber) {
            case 1 -> Cli.greeting();
            case 2 -> Even.start();
            case 3 -> Calc.start();
            case 4 -> GCD.start();
            case 5 -> Progression.start();
            case 6 -> Prime.start();
            default -> scanner.close();
        }
    }
}
