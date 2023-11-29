package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final int MIN_STEP = 2;
    private static final int MAX_STEP = 9;
    private static final int HIDE_MIN = 2;
    private static final int HIDE_MAX = 8;
    private static final int TAKES = 10;
    private static final String DESCRIPTION = "What number is missing in the progression?";
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

        int i = 1;

        StringBuilder sb = new StringBuilder();

        int startNumber = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
        int stepNumber = Utils.getRandomNumber(MIN_STEP, MAX_STEP);
        int  hideNumber = Utils.getRandomNumber(HIDE_MIN, HIDE_MAX);

        sb.append(startNumber);

        var guessNumber = 0;
        var nextNumber = startNumber;

        while (i < TAKES) {
            nextNumber += stepNumber;
            if (i == hideNumber) {
                sb.append(" ").append("..");
                guessNumber = nextNumber;
            } else {
                sb.append(" ").append(nextNumber);
            }
            i++;
        }
        var progression = sb.toString();

        var question = progression;
        var answer = Integer.toString(guessNumber);

        return new String[] {question, answer};
    }
}
