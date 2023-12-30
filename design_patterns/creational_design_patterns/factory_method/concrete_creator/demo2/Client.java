package design_patterns.creational_design_patterns.factory_method.concrete_creator.demo2;

class Client {
    public static void main(String[] args) {
        Animal animal1 = new AnimalFactory().getAnimal("Tiger");
        Animal animal2 = new AnimalFactory().getAnimal("Duck");

        animal1.talk();
        animal2.talk();
    }
}
