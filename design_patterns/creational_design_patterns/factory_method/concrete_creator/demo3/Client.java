package design_patterns.creational_design_patterns.factory_method.concrete_creator.demo3;

class Client {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.getNotification("SMS");
        notification.notifyUser();
    }
}
