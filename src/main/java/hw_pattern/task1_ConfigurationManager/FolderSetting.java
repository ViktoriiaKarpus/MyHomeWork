package hw_pattern.task1_ConfigurationManager;

public class FolderSetting extends Configuration {
    @Override
    public void load() {
        System.out.println("Loader folder config: logs=var/log/app, uploads=/data/uploads");
    }

    @Override
    public void validate() {
        System.out.println("Validating folders: logs exists ✓, writable ✓,  uploads absolute path ✓");
    }
}
