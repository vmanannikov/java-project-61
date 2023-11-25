package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greeting(Scanner sc) {
        System.out.println("Welcome to the Brain Games!");
        var name = sc.next();
        System.out.println("Hello, " + name + "!");
    }
}
