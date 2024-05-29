class Shape {
    private String color;
    private double size;

    public Shape(String color, double size) {
        this.color = color;
        this.size = size;
    }

    // Methods to get and set color and size

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    // Abstract method for calculating area
    public abstract double calculateArea();
}

// Derived class representing a circle
class Circle extends Shape {
    public Circle(String color, double radius) {
        super(color, radius);
    }

    // Override method to calculate area for circle
    @Override
    public double calculateArea() {
        double radius = getSize();
        return Math.PI * radius * radius;
    }
}

// Derived class representing a square
class Square extends Shape {
    public Square(String color, double sideLength) {
        super(color, sideLength);
    }

    // Override method to calculate area for square
    @Override
    public double calculateArea() {
        double sideLength = getSize();
        return sideLength * sideLength;
    }
}

// Derived class representing a triangle
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String color, double base, double height) {
        super(color, 0); // Size not used for triangles
        this.base = base;
        this.height = height;
    }

    // Override method to calculate area for triangle
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        Square square = new Square("Blue", 4.0);
        Triangle triangle = new Triangle("Green", 3.0, 6.0);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Triangle Area: " + triangle.calculateArea());
    }
}
