package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import hexlet.code.RoundData;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Progression {
    private final Engine ENGINE;
    private static final int RANGE_INDEX = 6;
    private static final int RANGE_LOW_LIMIT = 20;
    private static final int RANGE_STEP = 5;
    private static final int INDENT = 5;
    public static final String DESCRIPTION = "What number is missing in the progression?";

    public Progression() {
        this.ENGINE = new Engine();
    }

    public void runGame() {
        ENGINE.run(DESCRIPTION, Progression::getQuestionAnswer);
    }

    private static RoundData getQuestionAnswer() {
        int[] masNum = greatMas(Utils.getNum(RANGE_LOW_LIMIT), 1 + Utils.getNum(RANGE_STEP), INDENT + Utils.getNum(RANGE_INDEX));
        int searchVariableIndex = 1 + Utils.getNum(masNum.length - 1);//(index - 1);
        String question = IntStream.range(0, masNum.length)
                .mapToObj(i -> i == searchVariableIndex ? ".." : masNum[i])
                .map(Object::toString)
                .collect(Collectors.joining(" "));
        String answer = masNum[searchVariableIndex] + "";
        return new RoundData(question, answer);
    }

    private static int[] greatMas(int began, int step, int index) {
        int[] masNum = new int[index];
        for (int j = 0; j < masNum.length; j++) {
            masNum[j] = began + step;
            began = began + step;
        }
        return masNum;
    }
}
