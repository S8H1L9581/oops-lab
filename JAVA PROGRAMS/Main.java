import shapes.shapecalculator;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choose a shape to calculate");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter a choice between (1 - 3): ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double circleradius = sc.nextDouble();
                    shapecalculator ci = new shapecalculator(circleradius);
                    System.out.printf("Circle Area: %.2f\n", ci.circlearea()); // Added format specifier
                    System.out.printf("Circle Perimeter: %.2f\n", ci.circleperimeter()); // Added format specifier
                    break;

                case 2:
                    System.out.print("Enter the length of the rectangle: ");
                    double rectanglelength = sc.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double rectanglewidth = sc.nextDouble();
                    shapecalculator re = new shapecalculator(rectanglelength, rectanglewidth);
                    System.out.printf("Rectangle Area: %.2f\n", re.rectanglearea()); // Added format specifier
                    System.out.printf("Rectangle Perimeter: %.2f\n", re.rectangleperimeter()); // Added format specifier
                    break;

                case 3:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a number between 1 and 3."); // Updated to match choices
                    break;
            }
            System.out.println();
        } while (choice != 3);
        
        sc.close(); // Close the scanner to avoid resource leaks
    }
}