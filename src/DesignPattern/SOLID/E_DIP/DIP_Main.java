package DesignPattern.SOLID.E_DIP;

import DesignPattern.SOLID.E_DIP.Good_Code.EmailService;
import DesignPattern.SOLID.E_DIP.Good_Code.NotificationService;
import DesignPattern.SOLID.E_DIP.Good_Code.SMSService;

public class DIP_Main {
    public static void main(String[] args) {
        /**
         * High level modules shouldn't depend on low-level modules;
         * both should depend on abstractions.
         */

        NotificationService emailNotification = new NotificationService(new EmailService());
        emailNotification.notify("email sent successfully");


        NotificationService smsNotification = new NotificationService(new SMSService());
        smsNotification.notify("SMS sent successfully");

    }
}
