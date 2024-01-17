package design_patterns.structural_design_patterns.bridge.demo2;

class Client {
    public static void main(String[] args) {
        System.out.println("*****BRIDGE PATTERN*****");

        //Coloring Green to Triangle
        System.out.println("\nColoring Triangle:");
        ColorInterface green = new GreenColor();
        Shape triangleShape = new Triangle(green);
        triangleShape.drawShape(20);
        triangleShape.modifyBorder(20, 3);

        //Coloring Red to Rectangle
        System.out.println("\n\nColoring Rectangle :");
        ColorInterface red = new RedColor();
        Shape rectangleShape = new Rectangle(red);
        rectangleShape.drawShape(50);
        rectangleShape.modifyBorder(50, 2);
    }
}
