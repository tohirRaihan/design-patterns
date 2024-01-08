package design_patterns.creational_design_patterns.singleton.bill_pugh.demo2;

class MakeACaptain {

    // an instance attribute
    private int data = 0;
    
    private MakeACaptain() {}

    private static class SingletonHelper {
        private static final MakeACaptain _captain = new MakeACaptain();
    }

    public static MakeACaptain getCaptain() {
        return SingletonHelper._captain;
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
