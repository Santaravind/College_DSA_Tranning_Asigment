package Assigment.Five_Assigment5;



interface Notification{
    void sentNotification();
}
class EmailNotification implements Notification{

    @Override
    public void sentNotification() {
        System.out.println("Email sent successfully. ");
    }
}
class SMSNotification implements Notification{

    @Override
    public void sentNotification() {
        System.out.println("SMS Send successfully.");
    }
}
class PushNotification implements Notification{

    @Override
    public void sentNotification() {
        System.out.println("Push notification Sent successfully.");
    }
}
public class Notification_Service {
    public static void main(String[] args) {
         Notification email=new EmailNotification();
        Notification sms=new SMSNotification();
        Notification push=new PushNotification();
        email.sentNotification();
        sms.sentNotification();
        push.sentNotification();
    }
}
