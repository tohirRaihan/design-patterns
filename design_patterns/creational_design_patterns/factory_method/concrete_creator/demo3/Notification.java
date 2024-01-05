package design_patterns.creational_design_patterns.factory_method.concrete_creator.demo3;

interface Notification {
    void notifyUser();
}

class SMSNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification");
    }
    
}

class EmailNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending an e-mail notification");
    }
    
}

class PushNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending a push notification");
    }
    
}
