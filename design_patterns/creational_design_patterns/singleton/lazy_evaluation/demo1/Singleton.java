package design_patterns.creational_design_patterns.singleton.lazy_evaluation.demo1;

class Singleton {
    // the private reference to the one & only instance
    private static Singleton uniqueInstance = null;

    // an instance attribute
    private int data = 0;

    /**
     * The Singleton Constructor
     * Note that it is private!
     * No client can instantiate a Singleton object!
     */
    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
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
