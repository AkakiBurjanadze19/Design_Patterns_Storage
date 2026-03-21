package Creational.Factory.NotificationService;

public class NotificationFactory {
    public Notification createNotification(NotificationType channel) {
        if (channel == null) {
            return null;
        }

        return switch (channel) {
            case SMS -> new SmsNotification();
            case EMAIL -> new EmailNotification();
            case PUSH -> new PushNotification();
            default -> throw new IllegalArgumentException("Unknown channel: " + channel);
        };
    }
}