package design_patterns.creational_design_patterns.singleton.double_checked_locking;

class Singleton {
    // the private reference to the one & only instance
    private volatile static Singleton uniqueInstance = null;

    // an instance attribute
    private int data = 0;

    /**
     * The Singleton Constructor
     * Note that it is private!
     * No client can instantiate a Singleton object!
     */
    private Singleton() {}

    // by adding the synchronized keyword to getInstance() method
    // we force every thread to wait its turn before it can enter the method
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) { // we only synchronize first time only
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }

        return uniqueInstance;
    }

    // getter for data
    public int getData() {
        return data;
    }

    // setter for data
    public void setData(int v) {
        data = v;
    }
}
