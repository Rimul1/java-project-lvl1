package hexlet.code;

import java.util.Random;

public final class Utils {
    private static final Random RANDOM = new Random();

    public static int getNum(int range) {
        return RANDOM.nextInt(range);
    }
}
