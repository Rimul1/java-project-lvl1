package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RoundData;
import hexlet.code.Utils;

public class Calculator {
    private final Engine engine;
    private static final int RANGE = 10;
    public static final String DESCRIPTION = "What is the result of the expression?";

    public static RoundData getAnswerQuestion() {

        int firstNum = Utils.getNum(RANGE);
        int secondNum = Utils.getNum(RANGE);
        char operator = getChar();
        String answer = firstNum + " " + operator + " " + secondNum;
        String question = getSwitch(firstNum, operator, secondNum) + "";
        return new RoundData(answer, question);
    }

    public static char getChar() {
        char[] chars = "+-*".toCharArray();
        return chars[Utils.getNum(chars.length)];
    }

    public static int getSwitch(int firstNum, char aChar, int secondNum) {
        return switch (aChar) {
            case '+' -> firstNum + secondNum;
            case '-' -> firstNum - secondNum;
            case '*' -> firstNum * secondNum;
            default -> throw new IllegalArgumentException("Не сущетсвующий оператор");
        };
    }

    public final void runGame() {
        engine.run(DESCRIPTION, Calculator::getAnswerQuestion);
    }

    public Calculator() {
        this.engine = new Engine();
    }
}


