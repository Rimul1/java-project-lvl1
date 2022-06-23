package hexlet.code;

import hexlet.code.games.Progression;
import hexlet.code.games.PrimeNumbers;
import hexlet.code.games.Even;
import hexlet.code.games.GreatestCommonDivisor;
import hexlet.code.games.Calculator;

import java.util.Scanner;

public class Engine {
    public static void print() {
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
        final int one = 1;
        final int two = 2;
        final int three = 3;
        final int four = 4;
        final int five = 5;
        final int six = 6;
        final int zero = 0;
        switch (number) {
            case zero:
                break;
            case one:
                Cli cli = new Cli();
                break;
            case two:
                Even.parity();
                break;
            case three:
                Calculator.operations();
                break;
            case four:
                GreatestCommonDivisor.gcd();
                break;
            case five:
                Progression.arithmetic();
                break;
            case six:
                PrimeNumbers.prime();
                break;
            default:
                break;
        }
    }
}
