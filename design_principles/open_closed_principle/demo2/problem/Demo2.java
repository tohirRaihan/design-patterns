package design_principles.open_closed_principle.demo2.problem;

public class Demo2 {
    public static void main(String[] args) {

    }
}

class Rectangle {
    public double length;
    public double width;
}

class AreaCalculator {
    public double calculateRectangleArea(Rectangle rectangle) {
        return rectangle.length * rectangle.width;
    }

    public double calculateCircleArea(Circle circle) {
        return (22 / 7) * circle.radius * circle.radius;
    }
}

class Circle {
    public double radius;
}
