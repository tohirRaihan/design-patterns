package design_patterns.creational_design_patterns.abstract_factory_method.demo1;

interface Color {
    void fill();
}

class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method");
    }
    
}

class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method");
    }
    
}

class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method");
    }
    
}
