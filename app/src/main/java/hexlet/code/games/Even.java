package hexlet.code.games;

import hexlet.code.QuestionAnswer;
import hexlet.code.NumberRandomGenerator;

public class Even {
    private static final int RANGE = 100;
    public static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'";

    public static QuestionAnswer getAnswerQuestion() {
        int num = NumberRandomGenerator.getNum(RANGE);
        return new QuestionAnswer(num + "", num % 2 == 0 ? "yes" : "no");
    }
}
