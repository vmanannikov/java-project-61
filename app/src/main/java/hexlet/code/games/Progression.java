package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static int guessNumber;
    private static String progression;
    public static void start() {

        final int MIN_NUMBER = 1;
        final int MAX_NUMBER = 100;

        final int MIN_STEP = 2;
        final int MAX_STEP = 9;

        final int HIDE_MIN = 2;
        final int HIDE_MAX = 8;

        int i = 1;

        StringBuilder sb = new StringBuilder();

        int startNumber = Engine.getRandomNumber(MIN_NUMBER, MAX_NUMBER);

        int stepNumber = Engine.getRandomNumber(MIN_STEP, MAX_STEP);

        int  hideNumber = Engine.getRandomNumber(HIDE_MIN, HIDE_MAX);

        final int TAKES = 10;

        sb.append(startNumber);

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
        progression = sb.toString();
    }

    public static int getGuessNumber() {
        return guessNumber;
    }

    public static String getProgression() {
        return progression;
    }
}
