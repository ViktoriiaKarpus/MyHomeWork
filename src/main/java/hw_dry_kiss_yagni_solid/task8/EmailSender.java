package hw_dry_kiss_yagni_solid.task8;

public class EmailSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Отправка email: " + message);
    }
}
