package design_patterns.creational_design_patterns.factory_method.concrete_creator.demo1;

class ShapeFactory {

    // use getShape method to get object of type Shape
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
    
}
