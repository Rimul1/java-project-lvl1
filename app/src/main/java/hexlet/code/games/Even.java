package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RoundData;
import hexlet.code.Utils;

public class Even {
    private static final int RANGE = 100;
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    private final Engine ENGINE;

    public Even() {
        this.ENGINE = new Engine();
    }

    public void runGame() {
        ENGINE.run(DESCRIPTION, this::getAnswerQuestion);
    }

    private RoundData getAnswerQuestion() {
        int num = Utils.getNum(RANGE);
        String question = num + "";
        String answer = isEven(num) ? "yes" : "no";
        return new RoundData(question, answer);
    }

    private boolean isEven(int num) {
        return num % 2 == 0;
    }
}
