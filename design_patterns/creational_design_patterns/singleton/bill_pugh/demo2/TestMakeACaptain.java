package design_patterns.creational_design_patterns.singleton.bill_pugh.demo2;

class TestMakeACaptain {
    public static void main(String[] args) {
        System.out.println("***Singleton Pattern Demo***\n");
        System.out.println("Trying to make a captain for our team");

        MakeACaptain c1 = MakeACaptain.getCaptain();
        
        System.out.println("Trying to make another captain for out team");
        MakeACaptain c2 = MakeACaptain.getCaptain();

        if (c1 == c2) {
            System.out.println("c1 and c2 are the same instance");
        }
    }
}
