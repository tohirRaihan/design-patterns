package design_patterns.structural_design_patterns.bridge.demo1;

class Client {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car(new Produce(), new Assemble());
        vehicle1.menufacture();

        Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
        vehicle2.menufacture();
    }
}
