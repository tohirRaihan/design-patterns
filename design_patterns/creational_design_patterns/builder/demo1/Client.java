package design_patterns.creational_design_patterns.builder.demo1;

class Client {
    public static void main(String[] args) {
        System.out.println("***Builder Pattern Demo***\n");

        Director director = new Director();

        BuilderInterface carBuilder = new Car();
        BuilderInterface motorCycleBuilder = new Motorcycle();

        // making a car
        director.construct(carBuilder);
        Product product1 = carBuilder.getVehicle();
        product1.show();

        // making a motorcycle
        director.construct(motorCycleBuilder);
        Product product2 = motorCycleBuilder.getVehicle();
        product2.show();
    }
}
