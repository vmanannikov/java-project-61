package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    static String[] operations = {"*", "+", "-"};
    static int expResult;
    static String expression;
    public static void start() {

        var firstNumber = Engine.getRandomNumber(1, 100);
        var secondNumber = Engine.getRandomNumber(1, 100);
        var operation = operations[Engine.getRandomNumber(0, 2)];

        expression = firstNumber + " " + operation + " " + secondNumber;

        if (operation.equals("+")) {
            expResult = firstNumber + secondNumber;
        } else if (operation.equals("-")) {
            expResult = firstNumber - secondNumber;
        } else if (operation.equals("*")) {
            expResult = firstNumber * secondNumber;
        } else {
            expResult = 0;
        }
    }

    public static int getExpResult() {
        return expResult;
    }

    public static String getExpression() {
        return expression;
    }
}
