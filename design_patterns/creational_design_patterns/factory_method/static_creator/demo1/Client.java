package design_patterns.creational_design_patterns.factory_method.static_creator.demo1;

class Client {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape("Circle");
        shape1.draw();
    }
}
