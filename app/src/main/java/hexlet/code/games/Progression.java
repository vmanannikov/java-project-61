package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    static int guessNumber;
    static String progression;
    public static void start() {
        int i = 1;

        StringBuilder sb = new StringBuilder();

        int startNumber = Engine.getRandomNumber(1, 100);

        int stepNumber = Engine.getRandomNumber(2, 9);

        int  hideNumber = Engine.getRandomNumber(2, 8);

        sb.append(startNumber);

        var nextNumber = startNumber;

        while (i < 10) {
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
