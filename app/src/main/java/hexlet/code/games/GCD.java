package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {

    private static int result;
    private static String expression;
    static final int MIN_NUMBER = 1;
    static final int MAX_NUMBER = 100;

    public static void start() {

        var firstNumber = Engine.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
        var secondNumber = Engine.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
        expression = firstNumber + " " + secondNumber;
        result = gcd(firstNumber, secondNumber);
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static int getResult() {
        return result;
    }

    public static String getExpression() {
        return expression;
    }
}
