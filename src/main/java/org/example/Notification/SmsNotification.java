package org.example.Notification;

public class SmsNotification implements  NotificationService{
    @Override
    public void sendNotification(){
        System.out.println("SMS notification send");
    }
}
