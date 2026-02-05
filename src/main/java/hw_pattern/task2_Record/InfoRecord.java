package hw_pattern.task2_Record;

public class InfoRecord extends LoggerInformation {
    private String message;

    public InfoRecord(String message) {
        this.message = message;
    }

    @Override
    public void print() {
        System.out.println("INFO: " + message);
    }
}
