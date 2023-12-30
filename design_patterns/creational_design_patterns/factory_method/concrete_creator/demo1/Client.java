package design_patterns.creational_design_patterns.factory_method.concrete_creator.demo1;

class Client {
    public static void main(String[] args) {
        Shape shape1 = new ShapeFactory().getShape("Circle");
        Shape shape2 = new ShapeFactory().getShape("Square");
        Shape shape3 = new ShapeFactory().getShape("Rectangle");

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
