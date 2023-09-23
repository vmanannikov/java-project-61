package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {

    static int result;
    static String expression;

    public static void start() {
        var firstNumber = Engine.getRandomNumber(1, 100);
        var secondNumber = Engine.getRandomNumber(1, 100);
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
