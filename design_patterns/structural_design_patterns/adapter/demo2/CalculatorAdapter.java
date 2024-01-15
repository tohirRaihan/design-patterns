package design_patterns.structural_design_patterns.adapter.demo2;

class CalculatorAdapter implements CalculatorInterface {
    Calculator calculator;
    Triangle t;

    public CalculatorAdapter(Triangle myTriangle) {
        t = myTriangle;
    }

    public double getArea(Rectangle r) {
        calculator = new Calculator();

        Rectangle rectangle = new Rectangle();

        rectangle.length = t.base;
        rectangle.width = 0.5 * t.height;

        return calculator.getArea(rectangle);

    }
}
