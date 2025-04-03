package shapes;

public class shapecalculator {
    private double radius;
    private double length;
    private double width;
    
    public shapecalculator(double radius) {
        this.radius = radius;
    }

    public shapecalculator(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double circlearea() {
        return 3.14 * radius * radius;
    }

    public double circleperimeter() {
        return 2 * 3.14 * radius;
    }

    public double rectanglearea() {
        return length * width;
    }

    public double rectangleperimeter() {
        return 2 * (length + width);
    }
}