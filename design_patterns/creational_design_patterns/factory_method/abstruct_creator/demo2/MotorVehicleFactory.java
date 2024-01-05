package design_patterns.creational_design_patterns.factory_method.abstruct_creator.demo2;

abstract class MotorVehicleFactory {
    protected abstract MotorVehicle createMotorVehicle();

    public MotorVehicle create() {
        return createMotorVehicle();
    }
}

class MotorcycleFactory extends MotorVehicleFactory {
    @Override
    protected MotorVehicle createMotorVehicle() {
        return new Motorcycle();
    }
}

class CarFactory extends MotorVehicleFactory {
    @Override
    protected MotorVehicle createMotorVehicle() {
        return new Car();
    }
}
