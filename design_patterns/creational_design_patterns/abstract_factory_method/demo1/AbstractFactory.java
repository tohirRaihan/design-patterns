package design_patterns.creational_design_patterns.abstract_factory_method.demo1;

abstract class AbstractFactory {
    abstract Color getColor(String colorType);
    abstract Shape getShape(String shapeType);
}
