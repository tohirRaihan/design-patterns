package design_patterns.creational_design_patterns.factory_method.abstruct_creator.demo2;

interface MotorVehicle {
    void build();
}

class Motorcycle implements MotorVehicle {
    @Override
    public void build() {
        System.out.println("Build Motorcycle");
    }
}

class Car implements MotorVehicle {
    @Override
    public void build() {
        System.out.println("Build Car");
    }
}
