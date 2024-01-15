package design_patterns.structural_design_patterns.adapter.demo2;

interface CalculatorInterface {
    // target interface
    public double getArea(Rectangle r);
}

class Calculator implements CalculatorInterface
{
    Rectangle rectangle;

    public double getArea(Rectangle r) {
        rectangle = r;
        return rectangle.length * rectangle.width;
    }
}
