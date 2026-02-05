package hw_pattern.task1_ConfigurationManager;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager manager = new ConfigurationManager().getInstance();

        Configuration dbConfig = new DatabaseConnectionSettings();
        Configuration folderConfig = new FolderSetting();
        Configuration loggingConfig = new LoggingSetting();

        manager.register(dbConfig);
        manager.register(folderConfig);
        manager.register(loggingConfig);

        manager.get(DatabaseConnectionSettings.class).load();
        manager.get(FolderSetting.class).load();
        manager.get(LoggingSetting.class).load();

        manager.get(DatabaseConnectionSettings.class).validate();
        manager.get(FolderSetting.class).validate();
        manager.get(LoggingSetting.class).validate();

    }
}
