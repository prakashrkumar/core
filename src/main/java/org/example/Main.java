package org.example;

import org.example.Notification.EmailService;
import org.example.Notification.NotificationService;
import org.example.Notification.PopUpNotification;
import org.example.Notification.SmsNotification;

import javax.management.Notification;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        NotificationService notification =new PopUpNotification();
      // OderService order=new OderService(notification);
        OderService order=new OderService();
        order.setD(notification);
       order.placeOrder();
        System.out.println("hiiii");
    }
}
