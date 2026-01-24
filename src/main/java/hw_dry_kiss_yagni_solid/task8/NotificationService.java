package hw_dry_kiss_yagni_solid.task8;

public class NotificationService {

    private final NotificationSender sender;

    public NotificationService(NotificationSender sender) {
        this.sender = sender;
    }

    public void sendNotification(String message) {
        sender.send(message);
    }
}
