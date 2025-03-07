package DesignPattern.SOLID.E_DIP.Good_Code;

public class SMSService implements NotificationChannel{
    @Override
    public void send(String msg) {
        System.out.println("Sending SMS: " + msg);
    }
}
