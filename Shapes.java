package geometry;

// Abstract class to define the structure for shapes
abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

// Class for Square that extends Shape
class Square extends Shape {
    private double side;

    // Constructor
    public Square(double side) {
        this.side = side;
    }

    // Calculate area of the square
    @Override
    double area() {
        return side * side;
    }

    // Calculate perimeter of the square
    @Override
    double perimeter() {
        return 4 * side;
    }
}

// Class for Triangle that extends Shape
class Triangle extends Shape {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    // Constructor
    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Calculate area of the triangle
    @Override
    double area() {
        return 0.5 * base * height;
    }

    // Calculate perimeter of the triangle
    @Override
    double perimeter() {
        return side1 + side2 + side3;
    }
}