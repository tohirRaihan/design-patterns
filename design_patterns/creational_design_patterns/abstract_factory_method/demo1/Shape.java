package design_patterns.creational_design_patterns.abstract_factory_method.demo1;

interface Shape {
    void draw();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectange::draw() method");
    }

}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method");
    }

}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method");
    }

}
