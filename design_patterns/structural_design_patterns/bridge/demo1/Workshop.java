package design_patterns.structural_design_patterns.bridge.demo1;

abstract class Workshop {
    abstract public void work();
}

class Produce extends Workshop {

    @Override
    public void work() {
        System.out.println("Produced");
    }
    
}

class Assemble extends Workshop {

    @Override
    public void work() {
        System.out.println("And Assembled");
    }
    
}