package design_patterns.structural_design_patterns.adapter.demo1;

interface Duck {
    public void quack();
    public void fly();
}

class MallarDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
    
}
