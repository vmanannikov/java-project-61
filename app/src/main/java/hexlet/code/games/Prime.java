package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int MIN_NUMBER = 3;
    private static final int MAX_NUMBER = 100;
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int ROW_COUNT = 3;
    private static final int COLUMN_COUNT = 2;
    public static void start() {

        String[][] data = new String[ROW_COUNT][COLUMN_COUNT];

        for (int i = 0; i < ROW_COUNT; i++) {
            data[i] = getData();
        }

        Engine.start(DESCRIPTION, data);
    }

    public static boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static String[] getData() {

        var numberPrime = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);

        var question = Integer.toString(numberPrime);
        var answer = isPrime(numberPrime) ? "yes" : "no";

        return new String[] {question, answer};
    }
}
