package solid.singleresponsibility;



interface Shape {
    double calculatedArea();
    void drawShape();
}

class Circle implements Shape {
    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    public void drawShape(){
        System.out.println("Dwaring Circle with radius: " + radius);
    }
    @Override
    public double calculatedArea() {
        return Math.PI * radius * radius;
    }
}

class Square implements Shape {
    private double side;

    public Square (double side) {
        this.side = side;
    }
    public double calculatedArea(){
        return side * side;
    }

    public void drawShape(){
        System.out.println("Dwaring Sqaure with side: " + side);
    }
}

// Helper Classes that works as a single point of enrty.

// ShapeCalculator.java
class ShapeCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculatedArea();
    }
}

// ShapePrinter.java
class ShapePrinter {
    public void printShape(Shape shape) {
        shape.drawShape();
    }
}


public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();
        ShapePrinter printer = new ShapePrinter();

        Shape circle = new Circle(5.0);
        Shape square = new Square(5.0);

        System.out.println(calculator.calculateArea(square));
        System.out.println(calculator.calculateArea(circle));

        printer.printShape(square);
        printer.printShape(circle);
        
    }
}
