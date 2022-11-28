package hexlet.code;

import hexlet.code.games.Progression;
import hexlet.code.games.Even;
import hexlet.code.games.PrimeNumbers;
import hexlet.code.games.Calculator;
import hexlet.code.games.GreatestCommonDivisor;

import java.util.Scanner;

public class App {
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int FOUR = 4;
    private static final int FIVE = 5;
    private static final int SIX = 6;

    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        int number = scanner.nextInt();
        System.out.println();
        switch (number) {
            case ONE -> Cli.great();
            case TWO -> new Even().runGame();
            case THREE -> new Calculator().runGame();
            case FOUR -> new GreatestCommonDivisor().runGame();
            case FIVE -> new Progression().runGame();
            case SIX -> new PrimeNumbers().runGame();

            default -> {
            }
        }
    }
}
