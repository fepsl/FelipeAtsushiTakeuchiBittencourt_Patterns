public class Main {
    public static void main(String[] args) {
        String msg = "Bem-vindo ao sistema!";

        // O cliente só conhece as factories e o serviço, nunca as classes concretas
        NotificationService email = new NotificationService(new EmailNotificationFactory());
        NotificationService sms   = new NotificationService(new SMSNotificationFactory());
        NotificationService push  = new NotificationService(new PushNotificationFactory());

        email.notifyUser(msg);
        sms.notifyUser(msg);
        push.notifyUser(msg);
    }
}
