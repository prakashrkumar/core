package org.example;

import org.example.Notification.EmailService;
import org.example.Notification.NotificationService;
import org.example.Notification.PopUpNotification;
import org.example.Notification.SmsNotification;

public class OderService {
    // Tightly couple
    // EmailService d=new EmailService();
    // using losely couple
NotificationService d;


public  OderService(NotificationService t){
    this.d=t;
}


    public OderService(){}

    public void setD(NotificationService d) {
        this.d = d;
    }

    public void placeOrder(){

     System.out.println("order placed");
     d.sendNotification();

 }

}
