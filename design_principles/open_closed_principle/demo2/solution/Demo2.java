package design_principles.open_closed_principle.demo2.solution;

public class Demo2 {
    public static void main(String[] args) {

    }
}

interface Shape {
    public double calculateArea();
}

class Rectangle implements Shape {
    public double length;
    public double width;

    @Override
    public double calculateArea() {
        return this.length * this.width;
    }
}

class Circle implements Shape {
    public double radius;

    @Override
    public double calculateArea() {
        return (22 / 7) * radius * radius;
    }
}

class AreaCalculator {
    public double calculateShapeArea(Shape shape) {
        return shape.calculateArea();
    }
}
