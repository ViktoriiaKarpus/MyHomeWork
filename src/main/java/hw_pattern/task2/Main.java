package hw_pattern.task2;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger().getInstance();

        InfoRecord info = new InfoRecord("Connection to the db successfullly");
        WarningRecord warning = new WarningRecord("Deprecated method used");
        ErrorRecord error = new ErrorRecord("An error occurred while executing the operation");

        logger.register(info);
        logger.register(warning);
        logger.register(error);

        logger.logAll();

    }
}
