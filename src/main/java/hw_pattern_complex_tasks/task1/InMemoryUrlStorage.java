package hw_pattern_complex_tasks.task1;

import java.util.HashMap;
import java.util.Map;

public class InMemoryUrlStorage implements UrlStorage{

    private static InMemoryUrlStorage instance;

    private final Map<String, String> urls = new HashMap<>();

    private InMemoryUrlStorage(){

    }

    static InMemoryUrlStorage getInstance(){
        if(instance == null){
            instance = new InMemoryUrlStorage();
        }
        return instance;
    }

    @Override
    public void save(String shortUrl, String longUrl) {
        urls.put(shortUrl, longUrl);
    }

    @Override
    public String getLongUrl(String shortUrl) {
       return urls.get(shortUrl);
    }

    @Override
    public boolean contains(String shortUrl) {
       return urls.containsKey(shortUrl);
    }
}
