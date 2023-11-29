package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int ROW_COUNT = 3;
    private static final int COLUMN_COUNT = 2;
    public static void start() {

        String[][] data = new String[ROW_COUNT][COLUMN_COUNT];

        for (int i = 0; i < ROW_COUNT; i++) {
            data[i] = getData();
        }

        Engine.start(DESCRIPTION, data);
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private static String[] getData() {

        var firstNumber = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
        var secondNumber = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);

        var question = firstNumber + " " + secondNumber;
        var answer = Integer.toString(gcd(firstNumber, secondNumber));

        return new String[] {question, answer};
    }
}
