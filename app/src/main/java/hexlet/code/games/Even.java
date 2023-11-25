package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int ROW_COUNT = 3;
    private static final int COLUMN_COUNT = 2;
    public static void start() {

        String[][] data = new String[ROW_COUNT][COLUMN_COUNT];

        for (int i = 0; i < ROW_COUNT; i++) {
            data[i] = getData();
        }

        Engine.startEngine(DESCRIPTION, data);
    }

    private static String[] getData() {
        var number = (int) (Math.random() * MAX_NUMBER + MIN_NUMBER);
        var question = Integer.toString(number);
        var answer = isEven(number) ? "yes" : "no";
        return new String[] {question, answer};
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
