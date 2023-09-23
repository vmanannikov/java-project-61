package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static String[] operations = {"*", "+", "-"};
    private static int expResult;
    private static String expression;
    public static void start() {

        final int FIRST_NUMBER = 1;
        final int LAST_NUMBER = 100;

        final int FIRST_OPERATION_INDEX = 0;
        final int LAST_OPERATION_INDEX = 2;

        var firstNumber = Engine.getRandomNumber(FIRST_NUMBER, LAST_NUMBER);
        var secondNumber = Engine.getRandomNumber(FIRST_NUMBER, LAST_NUMBER);
        var operation = operations[Engine.getRandomNumber(FIRST_OPERATION_INDEX, LAST_OPERATION_INDEX)];

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
