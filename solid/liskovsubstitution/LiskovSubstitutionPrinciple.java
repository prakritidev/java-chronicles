package solid.liskovsubstitution;

interface Shape {
    double area();
}

class Rectangle implements Shape {
    protected double width;
    protected double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    public double area() {
        return width * height;
    }
}

class Square implements Shape {
    protected double side;
    
    public Square(double side) {
        this.side = side;
    }
    
    @Override
    public double area() {
        return side * side;
    }
}


public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape square = new Square(5);
        
        // Both rectangle and square can be used interchangeably
        printArea(rectangle);
        printArea(square);
    }
    
    public static void printArea(Shape shape) {
        System.out.println("Area: " + shape.area());
    }
}
