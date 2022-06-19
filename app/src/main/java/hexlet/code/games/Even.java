package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Generator;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void parity() {
        Cli cli = new Cli();
        Scanner scanner = new Scanner(System.in);
        Generator generator = new Generator();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");

        for (int i = 0; i < 3; i++) {

            int numRandom = generator.getNum(100);
            System.out.println("Question: " + numRandom);

            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            String exam;
            if (numRandom % 2 == 0) {
                exam = "yes";
            } else exam = "no";

            if (exam.equals(userAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + cli.getName());
                break;
            }
        }
        System.out.println("Congratulations, " + cli.getName());
    }
}
