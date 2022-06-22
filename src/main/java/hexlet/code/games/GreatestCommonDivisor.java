package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Generator;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void gcd() {
        Generator generator = new Generator();
        Cli cli = new Cli();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find the greatest common divisor of given numbers.");
        String win = null;

        final int gameItem = 3;
        for (int i = 0; i < gameItem; i++) {
            System.out.print("Question: ");
            win = "lost";

            final int range = 10;
            int fNum = generator.getNum(range);
            int sNum = generator.getNum(range);
            System.out.println(fNum + " " + sNum);

            System.out.print("Your answer: ");
            int userNum = scanner.nextInt();

            int gcd;
            if (fNum < sNum) {
                int tmp = fNum;
                fNum = sNum;
                sNum = tmp;
            }
            while (sNum != 0) {
                gcd = fNum % sNum;
                fNum = sNum;
                sNum = gcd;
            }
            System.out.println("Наибольший общий делитель равен: " + fNum);


            if (userNum == fNum) {
                System.out.println("Correct!");
                win = "win";
            } else {
                System.out.println(userNum + " is wrong answer ;(. Correct answer was " + fNum + ".\n"
                        + "Let's try again, " + cli.getName() + "!");
                break;
            }
        }
        if (win.equals("win")) {
            System.out.println("Congratulations, " + cli.getName());
        }
    }
}
