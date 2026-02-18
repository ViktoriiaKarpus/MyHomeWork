package hw_pattern_complex_tasks.task1;

public class Main {
    public static void main(String[] args) {
        UrlStorage storage = InMemoryUrlStorage.getInstance();

        ShorteningStrategy strategy =
                ShortenerFactory.createStrategy("base62");

        UrlShortenerService service =
                new UrlShortenerService(storage, strategy);

        String longUrl = "https://examples.com/very/long/url";

        String shortUrl = service.shortenUrl(longUrl);

        System.out.println("Original URL: " + longUrl);
        System.out.println("Short URL: " + shortUrl);
        System.out.println("Restored URL: " + service.restoreUrl(shortUrl));
    }
}
