package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    static final int MIN_NUMBER = 1;
    static final int MAX_NUMBER = 100;

    public static void start() {
        final String description = "Find the greatest common divisor of given numbers.";

        String[][] data = new String[3][2];

        for (int i = 0; i < 3; i++) {
            data[i] = getData();
        }

        Engine.startEngine(description, data);
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private static String[] getData() {

        var firstNumber = Engine.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
        var secondNumber = Engine.getRandomNumber(MIN_NUMBER, MAX_NUMBER);

        var question = firstNumber + " " + secondNumber;
        var answer = Integer.toString(gcd(firstNumber, secondNumber));

        return new String[] {question, answer};
    }
}
