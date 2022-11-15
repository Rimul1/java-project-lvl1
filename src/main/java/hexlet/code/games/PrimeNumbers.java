package hexlet.code.games;


import hexlet.code.NumberRandomGenerator;
import hexlet.code.QuestionAnswer;

public class PrimeNumbers {
    public static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int RANGE = 30;
    public static final int CHECK_FOUR = 4;

    public static QuestionAnswer getQuestionAnswer() {
        boolean check = true;
        final int pr = NumberRandomGenerator.getNum(RANGE);

        if ((pr < 2) | (pr == CHECK_FOUR)) {
            check = false;
        }

        for (int j = 2; j < pr / 2; j++) {
            if (pr % j == 0) {
                check = false;
                break;
            }
        }
        String exam;
        if (check) {
            exam = "yes";
        } else {
            exam = "no";
        }

        return new QuestionAnswer(pr + "", exam);
    }
}
