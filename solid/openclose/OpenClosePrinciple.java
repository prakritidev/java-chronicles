package solid.openclose;

// Drawing shapes with different colors
interface Shape {
    void draw();
}

class Circle implements Shape {
    private double radius;
    private String colourHex;

    public Circle(double radius, String colourHex) {
        this.radius = radius;
        this.colourHex = colourHex;
    }

    public void draw() {
        System.out.println("Printing Circle with color: " + colourHex + "with radius: " + radius);
    }
}

class Square implements Shape {
    private double side;
    private String colourHex;

    public Square(double side, String colourHex) {
        this.side = side;
        this.colourHex = colourHex;
    }

    public void draw() {
        System.out.println("Printing Circle with color: " + colourHex + "with side: " + side);
    }
}

class Drawing {
    public void drawShape(Shape shape) {
        shape.draw();
    }
}

public class OpenClosePrinciple {
    public static void main(String[] args) {
        Drawing draw = new Drawing();

        Shape circle = new Circle(5.0, "Red");
        Shape square = new Square(5.0, "Blue");

        draw.drawShape(square);
        draw.drawShape(circle);

    }
}
