package hw_pattern_complex_tasks.task1;

public class ShortenerFactory {

    public static ShorteningStrategy createStrategy(String type){
        switch (type.toLowerCase()){
            case "base62":
                return new Base62ShorteningStrategy();

            default:throw new IllegalArgumentException("Unknown strategy type: " + type);
        }
    }
}
