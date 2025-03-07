package DesignPattern.SOLID.E_DIP.Good_Code;

public class EmailService implements NotificationChannel{
    @Override
    public void send(String msg) {
        System.out.println("Sending Email: " + msg);
    }
}
