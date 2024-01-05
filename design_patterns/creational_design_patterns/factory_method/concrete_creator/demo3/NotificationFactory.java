package design_patterns.creational_design_patterns.factory_method.concrete_creator.demo3;

class NotificationFactory {
    
    // use getNotification method to get object of type Notification
    public Notification getNotification(String notificationType) {

        switch (notificationType.toUpperCase()) {
            case "SMS":
                return new SMSNotification();

            case "EMAIL":
                return new EmailNotification();

            case "PUSH":
                return new PushNotification();
        
            default:
                return null;
        }

    }

}
