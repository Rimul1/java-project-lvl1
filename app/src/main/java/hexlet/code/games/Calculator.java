package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Generator;
import java.util.Scanner;

public class Calculator {
    public static void operations() {
        Cli cli = new Cli();
        Scanner scanner = new Scanner(System.in);
        Generator generator = new Generator();
        String win = null;
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < 3; i++) {
            win = "lost";
            System.out.print("Question: ");

            int firstNum = generator.getNum(10);
            int secondNum = generator.getNum(10);
            char aChar = generator.getChar();
            System.out.println(firstNum + " " + aChar + " " + secondNum);

            System.out.print("Your answer: ");
            int userNum = scanner.nextInt();

            if (userNum == getSwitch(firstNum, aChar, secondNum)) {
                System.out.println("Correct");
                win = "win";
            } else {
                System.out.println(userNum + " is wrong answer ;(. Correct answer was " + getSwitch(firstNum, aChar, secondNum) + ".\n" +
                        "Let's try again, " + cli.getName() + "!");
                break;
            }
        }


        if (win.equals("win")) {
            System.out.println("Congratulations, " + cli.getName());
        }
    }

    public static int getSwitch(int firstNum, char aChar, int secondNum) {
        int result = 0;
        switch (aChar) {
            case '+' -> {
                result = firstNum + secondNum;
                return result;
            }
            case '-' -> {
                result = firstNum - secondNum;
                return result;
            }
            case '*' -> {
                result = firstNum * secondNum;
                return result;
            }
        }
        return result;
    }
}

