package design_patterns.creational_design_patterns.singleton.synchronized_method.demo1;

class TestSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        s1.setData(55);

        System.out.println("First Reference: " + s1);
        System.out.println("Singleton data value is: " + s1.getData());

        // Get another reference to the Singleton
        // Is it the same object?
        Singleton s2 = Singleton.getInstance();

        System.out.println("Second Reference: " + s2);
        System.out.println("Singleton data value is: " + s2.getData());
    }
}
