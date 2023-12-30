package design_patterns.creational_design_patterns.factory_method.concrete_creator.demo2;

interface Animal {
    void talk();
}

class Duck implements Animal {

    @Override
    public void talk() {
        System.out.println("Duck says: Pack...Pack");
    }

}

class Tiger implements Animal {

    @Override
    public void talk() {
        System.out.println("Tiger says: Halum...Halum");
    }
    
}
