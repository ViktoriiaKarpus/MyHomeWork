package hw_pattern_complex_tasks.task1;

public class UrlShortenerService {

    private final UrlStorage storage;
    private ShorteningStrategy strategy;

    public UrlShortenerService(UrlStorage storage, ShorteningStrategy strategy) {
        this.storage = storage;
        this.strategy = strategy;
    }

    public void setStrategy(ShorteningStrategy strategy) {
        this.strategy = strategy;
    }

    public String shortenUrl(String longUrl) {
        String shortUrl = strategy.shorten(longUrl);

        while (storage.contains(shortUrl)) {
            shortUrl = strategy.shorten(longUrl);
        }

        storage.save(shortUrl, longUrl);
        return shortUrl;
    }

    public String restoreUrl(String shortUrl){
        return storage.getLongUrl(shortUrl);
    }
}
