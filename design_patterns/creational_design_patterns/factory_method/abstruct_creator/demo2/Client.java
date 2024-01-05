package design_patterns.creational_design_patterns.factory_method.abstruct_creator.demo2;

class Client {
    public static void main(String[] args) {
        MotorVehicleFactory factory = new CarFactory();
        MotorVehicle vehicle1 = factory.create();
        vehicle1.build();
    }
}
