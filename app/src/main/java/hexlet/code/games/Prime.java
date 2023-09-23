package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    static int number;
    static String isPrime;
    public static void start() {
        number = Engine.getRandomNumber(3, 100);
        isPrime = Boolean.toString(isPrime(number));
    }

    public static boolean isPrime(int number) {
        if(number < 2) {
            return false;
        }

        for(int i = 2; i <= number / 2; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int getNumber() {
        return number;
    }

    public static String isPrime() {
        return isPrime.equals("true") ? "yes" : "no";
    }
}
