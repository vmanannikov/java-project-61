package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    static final int MIN_NUMBER = 1;
    static final int MAX_NUMBER = 100;

    public static void start() {
        final String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[][] data = new String[3][2];

        for (int i = 0; i < 3; i++) {
            data[i] = getData();
        }

        Engine.startEngine(description, data);
    }

    private static String[] getData() {
        var number = (int) (Math.random() * MAX_NUMBER + MIN_NUMBER);
        var question = Integer.toString(number);
        var answer = number % 2 == 0 ? "yes" : "no";
        return new String[] {question, answer};
    }
}
