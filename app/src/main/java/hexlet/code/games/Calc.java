package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int FIRST_NUMBER = 1;
    private static final int LAST_NUMBER = 100;
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final String[] OPERATIONS = {"*", "+", "-"};
    private static final int ROW_COUNT = 3;
    private static final int COLUMN_COUNT = 2;
    public static void start() {

        String[][] data = new String[ROW_COUNT][COLUMN_COUNT];

        for (int i = 0; i < ROW_COUNT; i++) {
            data[i] = getData();
        }

        Engine.start(DESCRIPTION, data);
    }

    private static String[] getData() {

        var firstNumber = Utils.getRandomNumber(FIRST_NUMBER, LAST_NUMBER);
        var secondNumber = Utils.getRandomNumber(FIRST_NUMBER, LAST_NUMBER);
        var operation = OPERATIONS[(int) (Math.random() * OPERATIONS.length)];

        var expression = firstNumber + " " + operation + " " + secondNumber;

        var expResult = switch (operation) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            default -> throw new RuntimeException("Undefined operator!");
        };

        var question = expression;
        var answer = Integer.toString(expResult);

        return new String[] {question, answer};
    }
}
