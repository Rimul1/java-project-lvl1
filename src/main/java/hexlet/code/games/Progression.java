package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Generator;

import java.util.Arrays;
import java.util.Scanner;

public class Progression {
    public static void arithmetic() {
        Generator generator = new Generator();
        Cli cli = new Cli();
        Scanner scanner = new Scanner(System.in);
        String win = null;
        System.out.println("What number is missing in the progression?");

        final int gameItem = 3;
        for (int i = 0; i < gameItem; i++) {
            win = "lost";

            final int rangeLowLimit = 20;
            int lowLimit = generator.getNum(rangeLowLimit);
            final int rangeStep = 5;
            int step = 1 + generator.getNum(rangeStep);
            final int rangeIndex = 6;
            final int indent = 5;
            int index = indent + generator.getNum(rangeIndex);
            int[] masNum = new int[index];

            for (int j = 0; j < masNum.length; j++) {
                masNum[j] = lowLimit + step;
                lowLimit = lowLimit + step;
            }
            int searchVariableIndex = 1 + generator.getNum(index - 1);
            int searchVariable = masNum[searchVariableIndex - 1];

            int[] newMasFirstPart = Arrays.copyOfRange(masNum, 0, searchVariableIndex - 1);
            int[] masSecondPart = Arrays.copyOfRange(masNum, searchVariableIndex, masNum.length);

            System.out.print("Question: ");
            System.out.println(Arrays.toString(newMasFirstPart) + " .. " + Arrays.toString(masSecondPart));

            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == searchVariable) {
                System.out.println("Correct!");
                win = "win";
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + searchVariable + ".\n"
                        + "Let's try again, " + cli.getName() + "!");
                break;
            }
        }
        if (win.equals("win")) {
            System.out.println("Congratulations, " + cli.getName() + "!");
        }
    }
}
