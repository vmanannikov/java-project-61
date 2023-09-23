package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    static String[] operations = {"*", "+", "-"};
    static int expResult;
    static String expression;
    public static void start() {

        var firstNumber = Engine.getRandomNumber(1, 100);
        var secondNumber = Engine.getRandomNumber(1, 100);
        var operation = operations[Engine.getRandomNumber(0,2)];

        expression = firstNumber + " " + operation + " " + secondNumber;

        switch (operation) {
            case "+" -> expResult = firstNumber + secondNumber;
            case "-" -> expResult = firstNumber - secondNumber;
            case "*" -> expResult = firstNumber * secondNumber;
        }
    }

    public static int getExpResult() {
        return expResult;
    }

    public static String getExpression() {
        return expression;
    }
}
