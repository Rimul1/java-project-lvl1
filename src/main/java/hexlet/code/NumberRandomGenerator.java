package hexlet.code;

import java.util.Random;

public final class NumberRandomGenerator {
    private static final Random RANDOM = new Random();


    public static int getNum(int range) {
        return RANDOM.nextInt(range);
    }

    public static char getChar() {
        char[] chars = "+-*".toCharArray();
        return chars[RANDOM.nextInt(chars.length)];
    }
}
