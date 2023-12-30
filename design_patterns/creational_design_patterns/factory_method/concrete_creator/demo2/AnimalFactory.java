package design_patterns.creational_design_patterns.factory_method.concrete_creator.demo2;

class AnimalFactory {

    public Animal getAnimal(String animalType) {

        switch (animalType.toUpperCase()) {
            case "DUCK":
                return new Duck();

            case "TIGER":
                return new Tiger();
        
            default:
                return null;
        }

    }
    
}
