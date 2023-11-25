package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static final int FIRST_NUMBER = 1;
    private static final int LAST_NUMBER = 100;
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final String[] OPERATIONS = {"*", "+", "-"};
    public static void start() {

        String[][] data = new String[3][2];

        for (int i = 0; i < 3; i++) {
            data[i] = getData();
        }

        Engine.startEngine(DESCRIPTION, data);
    }

    private static String[] getData() {

        var firstNumber = Engine.getRandomNumber(FIRST_NUMBER, LAST_NUMBER);
        var secondNumber = Engine.getRandomNumber(FIRST_NUMBER, LAST_NUMBER);
        var operation = OPERATIONS[(int) (Math.random() * OPERATIONS.length)];

        var expression = firstNumber + " " + operation + " " + secondNumber;

        var expResult = operation.equals("+")
                ? firstNumber + secondNumber : operation.equals("-")
                ? firstNumber - secondNumber : firstNumber * secondNumber;

        var question = expression;
        var answer = Integer.toString(expResult);

        return new String[] {question, answer};
    }
}
