package hw_pattern_complex_tasks.task1;

import java.util.Random;

public class Base62ShorteningStrategy implements ShorteningStrategy {

    private static final String CHAR_POOL =
            "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    @Override
    public String shorten(String longUrl) {
        int hash = Math.abs(longUrl.hashCode());
        return toBase62(hash);
    }

    private String toBase62(int number) {
        StringBuilder sb = new StringBuilder();

        while (number > 0) {
            sb.append(CHAR_POOL.charAt(number % 62));
            number /= 62;
        }

        return sb.reverse().toString();
    }
}
