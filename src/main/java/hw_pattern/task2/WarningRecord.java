package hw_pattern.task2;

public class WarningRecord extends LoggerInformation {

    private String message;

    public WarningRecord(String message) {
        this.message = message;
    }


    @Override
    public void print() {
        System.out.println("WARNING: " + message);
    }
}
