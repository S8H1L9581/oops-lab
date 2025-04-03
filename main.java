package geometry;

// Importing the Shape class and its subclasses
import geometry.Shape;
import geometry.Square;
import geometry.Triangle;

public class main {
    public static void main(String[] args) {
        // Create a square with side length 4
        Shape square = new Square(4);
        System.out.println("Square area is: " + square.area());
        System.out.println("Square perimeter is: " + square.perimeter());

        // Create a triangle with base 5, height 4, and sides 3, 4, 5
        Shape triangle = new Triangle(5, 4, 3, 4, 5);
        System.out.println("Triangle area is: " + triangle.area());
        System.out.println("Triangle perimeter is: " + triangle.perimeter());
    }
}