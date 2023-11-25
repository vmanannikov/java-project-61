package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final int MIN_NUMBER = 3;
    private static final int MAX_NUMBER = 100;
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void start() {

        String[][] data = new String[3][2];

        for (int i = 0; i < 3; i++) {
            data[i] = getData();
        }

        Engine.startEngine(DESCRIPTION, data);
    }

    public static boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static String[] getData() {

        var numberPrime = Engine.getRandomNumber(MIN_NUMBER, MAX_NUMBER);

        var question = Integer.toString(numberPrime);
        var answer = isPrime(numberPrime) ? "yes" : "no";

        return new String[] {question, answer};
    }
}
