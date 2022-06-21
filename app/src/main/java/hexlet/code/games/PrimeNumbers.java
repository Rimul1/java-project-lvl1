package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Generator;

import java.util.Scanner;

public class PrimeNumbers {
    public static void prime() {
        Cli cli = new Cli();
        Scanner scanner = new Scanner(System.in);
        Generator generator = new Generator();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        String win = null;
        String exam;
        for (int i = 0; i < 3; i++) {
            win = "lost";

            System.out.print("Question: ");
            int pr = generator.getNum(30);
            System.out.println(pr);

            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            boolean check = true;
            if (pr < 2) {
                check = false;
            }

            for (int j = 2; j < pr / 2; j++) {
                if (pr % j == 0) {
                    check = false;
                    break;
                }
            }


            if (check) {
                exam = "yes";
            } else exam = "no";

            if (exam.equals(userAnswer)) {
                System.out.println("Correct!");
                win = "win";
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + exam + ".");
                System.out.println("Let's try again, " + cli.getName());
                break;
            }
        }
        if (win.equals("win")) System.out.println("Congratulations, " + cli.getName());
    }
}
