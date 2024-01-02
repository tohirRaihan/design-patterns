package design_patterns.creational_design_patterns.abstract_factory_method.demo1;


public class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String colorType) {

        switch (colorType.toUpperCase()) {
            case "RED":
                return new Red();

            case "GREEN":
                return new Green();

            case "BLUE":
                return new Blue();
        
            default:
                return null;
        }

    }

    @Override
    Shape getShape(String shapeType) {
        throw new UnsupportedOperationException("Unsupported method 'getShape'");
    }

}