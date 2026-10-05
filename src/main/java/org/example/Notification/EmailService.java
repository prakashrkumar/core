package org.example.Notification;

public class EmailService implements NotificationService {
    @Override
    public void sendNotification(){
        System.out.println("email notifiaction send");
    }

}
