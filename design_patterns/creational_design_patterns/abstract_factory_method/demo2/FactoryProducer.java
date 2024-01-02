package design_patterns.creational_design_patterns.abstract_factory_method.demo2;

class FactoryProducer {
    public static MovieFactoryInterface getFactory(String factoryType) {

        switch (factoryType.toUpperCase()) {
            case "COMEDY":
                return new ComedyMovieFactory();

            case "ACTION":
                return new ActionMovieFactory();
        
            default:
                return null;
        }

    }
}
