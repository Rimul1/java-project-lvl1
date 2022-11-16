package hexlet.code.games;

import hexlet.code.QuestionAnswer;
import hexlet.code.NumberRandomGenerator;

public class Calculator {
    private static final int RANGE = 10;
    public static final String DESCRIPTION = "What is the result of the expression?";

    public static QuestionAnswer getAnswerQuestion() {

        int firstNum = NumberRandomGenerator.getNum(RANGE);
        int secondNum = NumberRandomGenerator.getNum(RANGE);
        char aChar = NumberRandomGenerator.getChar();
        return new QuestionAnswer((firstNum + " " + aChar + " " + secondNum),
                getSwitch(firstNum, aChar, secondNum) + "");
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
            default -> {
            }
        }
        return result;
    }
}

