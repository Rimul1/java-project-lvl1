package hexlet.code;


import java.util.Scanner;

public final class Cli {

    public static void great() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        System.out.println("Hello, " + scanner.next() + "!");
    }
}
