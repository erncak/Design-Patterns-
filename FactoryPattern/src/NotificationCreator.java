public abstract class NotificationCreator {
    public abstract Notification createNotification();
    public void notifyUser(){
        System.out.println("Creating notification");
        Notification notification = createNotification();
        notification.Notify();
    }
}
