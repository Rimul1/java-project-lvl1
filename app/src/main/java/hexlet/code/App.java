package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    private static final int ONE = 1;
    private static final int two = 2;
    private static final int three = 3;
    private static final int four = 4;
    private static final int five = 5;
    private static final int six = 6;
    private static final int zero = 0;

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
            case zero:
                break;
            case ONE:
                new Cli().great();
                break;
            case two:
                new Even().runGame();
                break;
            case three:
                new Calculator().runGame();
                break;
            case four:
                new GreatestCommonDivisor().runGame();
                break;
            case five:
                new Progression().runGame();
                break;
            case six:
                new PrimeNumbers().runGame();
                //engine.run(PrimeNumbers.DESCRIPTION, PrimeNumbers::getQuestionAnswer);
                break;
            default:
                break;
        }
    }
}
