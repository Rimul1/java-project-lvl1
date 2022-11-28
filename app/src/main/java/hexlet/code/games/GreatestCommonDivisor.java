package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import hexlet.code.RoundData;

public class GreatestCommonDivisor {
    private static final int RANGE = 10;
    public static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private final Engine engine;

    public GreatestCommonDivisor() {
        this.engine = new Engine();
    }

    public static RoundData getQuestionAnswer() {
        int fNum = Utils.getNum(RANGE);
        int sNum = Utils.getNum(RANGE);
        String question = fNum + " " + sNum;
        String answer = calculateGCD(fNum, sNum) + "";
        return new RoundData(question, answer);
    }

    static int calculateGCD(int fNum, int sNum) {
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

    public final void runGame() {
        engine.run(DESCRIPTION, GreatestCommonDivisor::getQuestionAnswer);
    }
}
