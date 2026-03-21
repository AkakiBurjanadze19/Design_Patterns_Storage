package Creational.Factory;

public class Usage {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();

        Notification smsService = notificationFactory.createNotification(NotificationType.SMS);
        Notification emailService = notificationFactory.createNotification(NotificationType.EMAIL);
        Notification pushService = notificationFactory.createNotification(NotificationType.PUSH);

        smsService.notifyUser("Your report is finished");
        emailService.notifyUser("Your report is finished");
        pushService.notifyUser("Your report is finished");
    }
}