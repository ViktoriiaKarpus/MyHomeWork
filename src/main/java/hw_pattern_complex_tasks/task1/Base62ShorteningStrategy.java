package hw_pattern_complex_tasks.task1;

import java.util.Random;

public class Base62ShorteningStrategy implements ShorteningStrategy {

    private static final String CHAR_POLL = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int SHORT_URL_LENGTH = 6;
    private final Random random = new Random();


    @Override
    public String shorten(String longUrl) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < SHORT_URL_LENGTH; i++){
            sb.append(CHAR_POLL.charAt(random.nextInt(CHAR_POLL.length())));
        }
        return sb.toString();
    }
}
