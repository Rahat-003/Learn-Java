package DesignPattern.SOLID.E_DIP.Good_Code;

public class NotificationService {
    private NotificationChannel notificationChannel;

    public NotificationService(NotificationChannel channel) {
        this.notificationChannel = channel;
    }

    public void notify(String msg) {
        notificationChannel.send(msg);
    }

}
