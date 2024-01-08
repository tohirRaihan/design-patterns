package design_patterns.creational_design_patterns.builder.demo1;

class Client {
    public static void main(String[] args) {
        System.out.println("***Builder Pattern Demo***\n");

        Director director = new Director();

        BuilderInterface carBuilder = new Car();

        director.construct(carBuilder);
        Product product1 = carBuilder.getVehicle();
        product1.show();
    }
}
