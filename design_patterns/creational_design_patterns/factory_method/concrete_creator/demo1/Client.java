package design_patterns.creational_design_patterns.factory_method.concrete_creator.demo1;

class Client {
    public static void main(String[] args) {
        Shape shape1 = new ShapeFactory().getShape("Circle");
        shape1.draw();
    }
}
