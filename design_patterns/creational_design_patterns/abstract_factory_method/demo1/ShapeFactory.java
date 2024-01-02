package design_patterns.creational_design_patterns.abstract_factory_method.demo1;

class ShapeFactory extends AbstractFactory {

    // use getShape method to get object of type Shape
    @Override
    public Shape getShape(String shapeType) {

        switch (shapeType.toUpperCase()) {
            case "CIRCLE":
                return new Circle();

            case "SQUARE":
                return new Square();

            case "RECTANGLE":
                return new Rectangle();
        
            default:
                return null;
        }

    }

    @Override
    Color getColor(String colorType) {
        throw new UnsupportedOperationException("Unsupported method 'getColor'");
    }
    
}
