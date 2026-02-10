package hw_pattern.task1_ConfigurationManager;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {

    private static ConfigurationManager instance;

    ConfigurationManager() {

    }

    private final Map<Class<? extends Configuration>, Configuration> configurations = new HashMap<>();

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public void register(Configuration configuration) {
        configurations.put(configuration.getClass(), configuration);
    }

    public <T extends Configuration> T get(Class<T> configClass) {
        return configClass.cast(configurations.get(configClass));
    }
}
