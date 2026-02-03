package hw_pattern.task2;

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
