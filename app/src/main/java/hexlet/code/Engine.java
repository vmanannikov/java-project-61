package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {
    public static void startEngine() {

        Scanner scanner = new Scanner(System.in);

        printMenu();

        var choice = scanner.next();
        printChoice(choice);

        welcome();
        System.out.print("May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");

        switch (choice) {
            case "1" -> {
                Cli.greeting(name);
            }
            case "2" -> {
                Even.start(name);
            }
            case "3" -> {
                int take = 1;
                while (take < 4) {
                    Calc.start();
                    System.out.println("What is the result of the expression?");
                    var question = Calc.getExpression();
                    printQuestion(question);
                    System.out.print("Your answer: ");
                    var answer = scanner.next();

                    if (Integer.parseInt(answer) == Calc.getExpResult()) {
                        System.out.println("Correct!");
                        System.out.println();
                    } else {
                        System.out.println("'" + answer + "' "
                                + "is wrong answer ;(. "
                                + "Correct answer was "
                                + "'" + Calc.getExpResult() + "'");
                        System.out.println("Let's try again, " + name + "!");
                        break;
                    }
                    take++;
                }

                System.out.println("Congratulations, " + name + "!");
            }
            case "4" -> {
                int take = 1;
                while (take < 4) {
                    GCD.start();
                    System.out.println("Find the greatest common divisor of given numbers.");
                    var question = GCD.getExpression();
                    printQuestion(question);
                    System.out.print("Your answer: ");
                    var answer = scanner.next();

                    if (Integer.parseInt(answer) == GCD.getResult()) {
                        System.out.println("Correct!");
                        System.out.println();
                    } else {
                        System.out.println("'" + answer + "' "
                                + "is wrong answer ;(. "
                                + "Correct answer was "
                                + "'" + Calc.getExpResult() + "'");
                        System.out.println("Let's try again, " + name + "!");
                        break;
                    }
                    take++;
                }

                System.out.println("Congratulations, " + name + "!");
            }
            case "5" -> {
                int take = 1;
                while (take < 4) {
                    Progression.start();
                    System.out.println("What number is missing in the progression?");
                    var question = Progression.getProgression();
                    printQuestion(question);
                    System.out.print("Your answer: ");
                    var answer = scanner.next();

                    if (Integer.parseInt(answer) == Progression.getGuessNumber()) {
                        System.out.println("Correct!");
                        System.out.println();
                    } else {
                        System.out.println("'" + answer + "' "
                                + "is wrong answer ;(. "
                                + "Correct answer was "
                                + "'" + Progression.getGuessNumber() + "'");
                        System.out.println("Let's try again, " + name + "!");
                        break;
                    }
                    take++;
                }

                System.out.println("Congratulations, " + name + "!");
            }
            case "6" -> {
                int take = 1;
                while (take < 4) {
                    Prime.start();
                    var question = Prime.getNumber();
                    System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'");
                    printQuestion(Integer.toString(question));
                    System.out.print("Your answer: ");
                    var answer = scanner.next();

                    if (answer.equals(Prime.isPrime())) {
                        System.out.println("Correct!");
                        System.out.println();
                    } else {
                        System.out.println("'" + answer + "' "
                                + "is wrong answer ;(. "
                                + "Correct answer was "
                                + "'" + Prime.isPrime() + "'");
                        System.out.println("Let's try again, " + name + "!");
                        break;
                    }
                    take++;
                }

                System.out.println("Congratulations, " + name + "!");
            }
            default -> {
                scanner.close();
            }
        }
    }

    public static int getRandomNumber(int minNumber, int maxNumber) {
        return (int) (Math.random() * maxNumber + minNumber);
    }
    public static void printMenu() {
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit\n");
    }

    public static void welcome() {
        System.out.println("Welcome to the Brain Games!");
    }

    public static void printChoice(String choice) {
        System.out.print("Your choice: " + choice);
        System.out.println();
    }

    public static void printQuestion(String question) {
        System.out.print("Question: " + question);
        System.out.println();
    }
}
