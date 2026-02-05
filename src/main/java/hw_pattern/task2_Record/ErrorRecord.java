package hw_pattern.task2_Record;

public class ErrorRecord extends LoggerInformation {

    private String message;

    public ErrorRecord(String message) {
        this.message = message;
    }

    @Override
    public void print() {
        System.out.println("ERROR :" + message);
    }
}
