package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    static final int MIN_NUMBER = 1;
    static final int MAX_NUMBER = 100;
    static final int MIN_STEP = 2;
    static final int MAX_STEP = 9;
    static final int HIDE_MIN = 2;
    static final int HIDE_MAX = 8;
    static final int TAKES = 10;
    public static void start() {
        final String description = "What number is missing in the progression?";

        String[][] data = new String[3][2];

        for (int i = 0; i < 3; i++) {
            data[i] = getData();
        }

        Engine.startEngine(description, data);
    }

    private static String[] getData() {

        int i = 1;

        StringBuilder sb = new StringBuilder();

        int startNumber = Engine.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
        int stepNumber = Engine.getRandomNumber(MIN_STEP, MAX_STEP);
        int  hideNumber = Engine.getRandomNumber(HIDE_MIN, HIDE_MAX);

        sb.append(startNumber);

        var guessNumber = 0;
        var nextNumber = startNumber;

        while (i < TAKES) {
            nextNumber += stepNumber;
            if (i == hideNumber) {
                sb.append(" " + "..");
                guessNumber = nextNumber;
            } else {
                sb.append(" " + nextNumber);
            }
            i++;
        }
        var progression = sb.toString();

        var question = progression;
        var answer = Integer.toString(guessNumber);

        return new String[] {question, answer};
    }
}
