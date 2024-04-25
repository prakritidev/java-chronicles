package solid.dependencyinjection;

interface Notification {
    void sendNotification();
}

// Concrete implementation of email notification
class EmailNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Sending email notification...");
    }
}

// Concrete implementation of SMS notification
class SMSNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Sending SMS notification...");
    }
}

// High-level module (NotificationService) depends on abstractions (Notification)
class NotificationService {
    private Notification notification;

    // Constructor injection
    public NotificationService(Notification notification) {
        this.notification = notification;
    }

    public void sendNotification() {
        notification.sendNotification();
    }
}

public class DependencyInjectionPrinciple {
    public static void main(String[] args) {
        // Using EmailNotification
        Notification emailNotification = new EmailNotification();
        NotificationService emailNotificationService = new NotificationService(emailNotification);
        emailNotificationService.sendNotification();

        // Using SMSNotification
        Notification smsNotification = new SMSNotification();
        NotificationService smsNotificationService = new NotificationService(smsNotification);
        smsNotificationService.sendNotification();
    }
}