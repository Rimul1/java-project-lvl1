package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utils;
import hexlet.code.RoundData;

public class PrimeNumbers {
    public static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int RANGE = 30;
    public static final int CHECK_FOUR = 4;
    private final Engine engine;

    public PrimeNumbers() {
        this.engine = new Engine();
    }

    public final void runGame() {
        engine.run(DESCRIPTION, PrimeNumbers::getQuestionAnswer);
    }

    public static RoundData getQuestionAnswer() {
        boolean check = true;
        final int pr = Utils.getNum(RANGE);

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


        String question = pr + "";
        String answer = exam;
        return new RoundData(question, answer);
    }
}
