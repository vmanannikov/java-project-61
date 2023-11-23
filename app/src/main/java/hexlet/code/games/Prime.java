package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    static final int MIN_NUMBER = 3;
    static final int MAX_NUMBER = 100;
    public static void start() {

        final String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[][] data = new String[3][2];

        for (int i = 0; i < 3; i++) {
            data[i] = getData();
        }

        Engine.startEngine(description, data);
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
        var isPrime = Boolean.toString(isPrime(numberPrime));

        var question = Integer.toString(numberPrime);
        var answer = isPrime.equals("true") ? "yes" : "no";

        return new String[] {question, answer};
    }
}
