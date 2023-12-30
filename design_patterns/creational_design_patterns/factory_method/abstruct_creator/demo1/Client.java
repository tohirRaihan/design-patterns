package design_patterns.creational_design_patterns.factory_method.abstruct_creator.demo1;

class Client {
    public static void main(String[] args) {
        Shape shape1 = new CircleFactory().getShape();
        shape1.draw();
    }
}
