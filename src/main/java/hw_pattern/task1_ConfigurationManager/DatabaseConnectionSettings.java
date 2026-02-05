package hw_pattern.task1_ConfigurationManager;

public class DatabaseConnectionSettings extends Configuration {
    @Override
    public void load() {
        System.out.println("Loading DB config: url=jdbc:mysql://localhost:3333/mydb, user=root, password= secret");
    }

    @Override
    public void validate() {
        System.out.println("Validating DB: url present ✓, port=3333 (1-2314567) ✓, user not empty ✓ ");
    }
}
