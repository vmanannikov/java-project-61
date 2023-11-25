package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static final int GREET_NUM = 1;
    public static final int EVEN_NUM = 2;
    public static final int CALC_NUM = 3;
    public static final int GCD_NUM = 4;
    public static final int PROGRESSION_NUM = 5;
    public static final int PRIME_NUM = 6;
    public static final int EXIT_NUM = 0;

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

        var game = scanner.nextInt();
        System.out.println();

        switch (game) {
            case GREET_NUM -> Cli.greeting(scanner);
            case EVEN_NUM -> Even.start();
            case CALC_NUM -> Calc.start();
            case GCD_NUM -> GCD.start();
            case PROGRESSION_NUM -> Progression.start();
            case PRIME_NUM -> Prime.start();
            case EXIT_NUM -> System.exit(0);
            default -> System.out.println("Unknown game number!");
        }
        scanner.close();
    }
}
