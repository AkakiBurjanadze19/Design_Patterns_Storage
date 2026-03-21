package Creational.Factory.NotificationService;

public class PushNotification implements Notification {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending message by push: " + message);
    }
}
