package design_patterns.creational_design_patterns.abstract_factory_method.demo1;

class Client {
    public static void main(String[] args) {
        // get shape factory
        AbstractFactory shapeFactory = FactoryProducer.geFactory("Shape");

        // get an object of shape Circle
        Shape shape1 = shapeFactory.getShape("Circle");

        // call draw method of shape Circle
        shape1.draw();
    }
}
