package hw_pattern_complex_tasks.task1;

public interface UrlStorage {
    void save(String shortUrl, String longUrl);
    String getLongUrl(String shortUrl);
    boolean contains(String shortUrl);
}
