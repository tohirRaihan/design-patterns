package design_patterns.creational_design_patterns.singleton.eager_evaluation.demo1;

class Singleton {
    // create an instance of singleton in a static initializer, code is guaranteed
    // to be thread safe
    private static Singleton uniqueInstance = new Singleton();

    // an instance attribute
    private int data = 0;

    private Singleton() {
    }

    public static Singleton getInstance() {
        // we already got an instance so just return it
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
