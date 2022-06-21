package hexlet.code;

import hexlet.code.games.*;

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
        Cli cli = new Cli();
        switch (number) {
            case 0:
                break;
            case 1:
                cli.greet();
            case 2:
                cli.greet();
                Even.parity();
                break;
            case 3:
                cli.greet();
                Calculator.operations();
                break;
            case 4:
                cli.greet();
                Greatest_Common_Divisor.gcd();
                break;
            case 5:
                cli.greet();
                Progression.arithmetic();
                break;
            case 6:
                cli.greet();
                PrimeNumbers.prime();
                break;
        }
    }
}
