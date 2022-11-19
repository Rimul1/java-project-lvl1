package hexlet.code.games;

import hexlet.code.NumberRandomGenerator;
import hexlet.code.QuestionAnswer;

import java.util.Arrays;

public class Progression {
    private static final int RANGE_INDEX = 6;
    private static final int RANGE_LOW_LIMIT = 20;
    private static final int RANGE_STEP = 5;
    private static final int INDENT = 5;
    public static final String DESCRIPTION = "What number is missing in the progression?";

    public static QuestionAnswer getQuestionAnswer() {
        int lowLimit = NumberRandomGenerator.getNum(RANGE_LOW_LIMIT);
        int step = 1 + NumberRandomGenerator.getNum(RANGE_STEP);

        int index = INDENT + NumberRandomGenerator.getNum(RANGE_INDEX);
        int[] masNum = new int[index];

        for (int j = 0; j < masNum.length; j++) {
            masNum[j] = lowLimit + step;
            lowLimit = lowLimit + step;
        }
        int searchVariableIndex = 1 + NumberRandomGenerator.getNum(index - 1);
        int searchVariable = masNum[searchVariableIndex - 1];

        int[] newMasFirstPart = Arrays.copyOfRange(masNum, 0, searchVariableIndex - 1);
        int[] masSecondPart = Arrays.copyOfRange(masNum, searchVariableIndex, masNum.length);
        StringBuilder stNewMasFirstPart = new StringBuilder();
        for (int item : newMasFirstPart) {
            stNewMasFirstPart.append(item).append(" ");
        }

        StringBuilder stMasSecondPart = new StringBuilder();
        for (int item : masSecondPart) {
            stMasSecondPart.append(item).append(" ");
        }
        return new QuestionAnswer(stNewMasFirstPart + ".. " + stMasSecondPart, searchVariable + "");
    }
}