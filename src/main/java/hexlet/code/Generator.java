package hexlet.code;

import java.util.Random;

public final class Generator {
    private final Random random;

    public Generator() {
        this.random = new Random();
    }

    public int getNum(int range) {
        return random.nextInt(range);
    }

    public char getChar() {
        char[] chars = "+-*".toCharArray();
        return chars[random.nextInt(chars.length)];
    }
}
