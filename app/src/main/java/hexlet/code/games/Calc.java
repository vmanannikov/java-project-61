package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    static final int FIRST_NUMBER = 1;
    static final int LAST_NUMBER = 100;
    static final int FIRST_OPERATION_INDEX = 0;
    static final int LAST_OPERATION_INDEX = 2;
    public static void start() {
        final String description = "What is the result of the expression?";

        String[][] data = new String[3][2];

        for (int i = 0; i < 3; i++) {
            data[i] = getData();
        }

        Engine.startEngine(description, data);
    }

    private static String[] getData() {
        String[] operations = {"*", "+", "-"};

        var firstNumber = Engine.getRandomNumber(FIRST_NUMBER, LAST_NUMBER);
        var secondNumber = Engine.getRandomNumber(FIRST_NUMBER, LAST_NUMBER);
        var operation = operations[Engine.getRandomNumber(FIRST_OPERATION_INDEX, LAST_OPERATION_INDEX)];

        var expression = firstNumber + " " + operation + " " + secondNumber;
        var expResult = 0;

        if (operation.equals("+")) {
            expResult = firstNumber + secondNumber;
        } else if (operation.equals("-")) {
            expResult = firstNumber - secondNumber;
        } else if (operation.equals("*")) {
            expResult = firstNumber * secondNumber;
        }

        var question = expression;
        var answer = Integer.toString(expResult);

        return new String[] {question, answer};
    }
}
