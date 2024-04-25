# SOLID Stuff 


### Single Responsibility Principle (SRP)

Single Class responsible for two stuff. Not good.
```
class Shape {
    public double calculateArea(){

    }

    public void drawShape(){

    }
}
```
Corrrect way of doing it so that other functionality can be added without touching previous APIs or classes.

```

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

```

## Open/Closed Principle (OCP):

Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification. We can add new shapes and colors in the main configuration and dont have to update the old classes code.

```

// Drawing shapes with different colors
interface Shape {
    void draw();
}

class Circle implements Shape {
    private double radius;
    private String colourHex;

    public Circle (double radius, String colourHex) {
        this.radius = radius;
        this.colourHex = colourHex;
    }

    public void draw() {
        // draw circle logic with colot 
    }
}

class Square implements Shape {
    public void draw() {
        // draw square logic
    }
}

class Drawing {
    public void drawShape(Shape shape) {
        shape.draw();
    }
}

public class OpenClosePrinciple {
    public static void main(String[] args) {
        Drawing draw = new ShapeCalculator();

        Shape circle = new Circle(5.0, Red);
        Shape square = new Square(5.0, Blue);

        printer.printShape(drawShape);
        printer.printShape(drawShape);
        
    }
}
```
## Liskov Substitution Principle (LSP):

```
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

public class Main {
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

```

## Interface Segregation Principle (ISP):

Clients should not be forced to depend on interfaces they do not use. Fax is avaible but we don't have to use it in our photocopier, I see think like an aggregator patter where you build a class aggrgating some functioanlies that adhere to single responsibility principles.

```

// Interface representing the functionality related to printing
interface Printer {
    void print();
}

// Interface representing the functionality related to scanning
interface Scanner {
    void scan();
}

// Interface representing the functionality related to faxing
interface Fax {
    void fax();
}

// Class implementing only printing functionality
class SimplePrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing...");
    }
}

// Class implementing only scanning functionality
class SimpleScanner implements Scanner {
    @Override
    public void scan() {
        System.out.println("Scanning...");
    }
}

// Class implementing only faxing functionality
class SimpleFax implements Fax {
    @Override
    public void fax() {
        System.out.println("Faxing...");
    }
}

// Class implementing functionalities of both printing and scanning
class Photocopier implements Printer, Scanner {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }
}

public class InterfaceSegregationPrinciple {
    public static void main(String[] args) {
        // Using SimplePrinter
        Printer printer = new SimplePrinter();
        printer.print();

        // Using SimpleScanner
        Scanner scanner = new SimpleScanner();
        scanner.scan();

        // Using Photocopier
        Printer photocopierPrinter = new Photocopier();
        Scanner photocopierScanner = new Photocopier();
        photocopierPrinter.print();
        photocopierScanner.scan();
    }
}
```

## Dependency Injection: 

High-level modules should not depend on low-level modules. Both should depend on abstractions. This is what spring boot does. #beans

```
// Interface representing the functionality of a notification
interface Notification {
    void sendNotification();
}

// Concrete implementation of email notification
class EmailNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Sending email notification...");
    }
}

// Concrete implementation of SMS notification
class SMSNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Sending SMS notification...");
    }
}

// High-level module (NotificationService) depends on abstractions (Notification)
class NotificationService {
    private Notification notification;

    // Constructor injection
    public NotificationService(Notification notification) {
        this.notification = notification;
    }

    public void sendNotification() {
        notification.sendNotification();
    }
}

public class Main {
    public static void main(String[] args) {
        // Using EmailNotification
        Notification emailNotification = new EmailNotification();
        NotificationService emailNotificationService = new NotificationService(emailNotification);
        emailNotificationService.sendNotification();

        // Using SMSNotification
        Notification smsNotification = new SMSNotification();
        NotificationService smsNotificationService = new NotificationService(smsNotification);
        smsNotificationService.sendNotification();
    }
}

```