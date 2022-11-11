package hexlet.code.games;
import hexlet.code.NumberRandomGenerator;
import hexlet.code.QuestionAnswer;

public class GreatestCommonDivisor {
    private static final int RANGE = 10;
    public static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static QuestionAnswer getQuestionAnswer() {
        int fNum = NumberRandomGenerator.getNum(RANGE);
        int sNum = NumberRandomGenerator.getNum(RANGE);

        return new QuestionAnswer(fNum + " " + sNum, getAnswer(fNum, sNum) + "");
    }

    static int getAnswer(int fNum, int sNum) {
        int gcd;
        if (fNum < sNum) {
            int tmp = fNum;
            fNum = sNum;
            sNum = tmp;
        }
        while (sNum != 0) {
            gcd = fNum % sNum;
            fNum = sNum;
            sNum = gcd;
        }
        return fNum;
    }
}