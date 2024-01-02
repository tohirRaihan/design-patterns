package design_patterns.creational_design_patterns.abstract_factory_method.demo1;

class FactoryProducer {

    public static AbstractFactory geFactory(String factoryType) {

        switch (factoryType.toUpperCase()) {
            case "SHAPE":
                return new ShapeFactory();

            case "COLOR":
                return new ColorFactory();
        
            default:
                return null;
        }

    }

}
