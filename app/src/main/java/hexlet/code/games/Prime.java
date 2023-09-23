package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static int numberPrime;

    private static String isPrime;
    public static void start() {
        static final int MIN_NUMBER = 3;
        static final int MAX_NUMBER = 100;

        numberPrime = Engine.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
        isPrime = Boolean.toString(isPrime(numberPrime));
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

    public static int getNumber() {
        return numberPrime;
    }

    public static String isPrime() {
        return isPrime.equals("true") ? "yes" : "no";
    }
}
