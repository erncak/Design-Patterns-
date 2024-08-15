public class Main {
    public static void main(String[] args) {

        NotificationCreator email = new EmailNotificationCreator();
        email.notifyUser();
        NotificationCreator sms = new SmsNotificationCreator();
        sms.notifyUser();
    }
}