package hw_pattern.task2_Record;

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
