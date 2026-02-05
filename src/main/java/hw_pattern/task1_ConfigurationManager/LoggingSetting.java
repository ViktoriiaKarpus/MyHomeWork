package hw_pattern.task1_ConfigurationManager;

public class LoggingSetting extends Configuration {
    @Override
    public void load() {
        System.out.println("Loading logging config: level=INFO, file=app.log, maxSize=10MB");
    }

    @Override
    public void validate() {
        System.out.println("Validating logging: level = INFO/DEBAG/WARN ✓, file writable ✓, maxSize > 0 ✓");
    }
}
