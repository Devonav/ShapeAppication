//1. Devon Villalona, COP3330.CRN12565, 8/26/2023
//2. The program is designed to represent and manipulate geometric shapes, specifically rectangles and circles.
//The objective is to model these shapes using classes, allowing for instantiation of individual objects with specific attributes.

//3. Rectangle Dimensions: For each rectangle, the user will be prompted to provide two inputs:
//Length: The length of the rectangle.

//Width: The width of the rectangle.
//Circle Dimension: For each circle, the user will be prompted to provide:

//Radius: The radius of the circle.
//After collecting the necessary inputs from the user, the program will process the data by
//computing the area for each shape and will display the following outputs for the rectangle and circle.
import java.util.Scanner;


public class ShapeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for the first rectangle
        System.out.print("Enter length for the first rectangle: ");
        double length1 = scanner.nextDouble();

        System.out.print("Enter width for the first rectangle: ");
        double width1 = scanner.nextDouble();

        // User input for the second rectangle
        System.out.print("Enter length for the second rectangle: ");
        double length2 = scanner.nextDouble();

        System.out.print("Enter width for the second rectangle: ");
        double width2 = scanner.nextDouble();

        // User input for the circles
        System.out.print("Enter radius for the first circle: ");
        double radius1 = scanner.nextDouble();

        System.out.print("Enter radius for the second circle: ");
        double radius2 = scanner.nextDouble();

        // Create the shapes based on user input
        Circle circle1 = new Circle(radius1);
        Circle circle2 = new Circle(radius2);
        Rectangle rectangle1 = new Rectangle(length1, width1);
        Rectangle rectangle2 = new Rectangle(length2, width2);

        // Print the details of each rectangle
        System.out.println("\nRectangle with sides " + rectangle1.getLength() + " and "
                + rectangle1.getWidth() + " has area " + rectangle1.computeArea());

        System.out.println("Rectangle with sides " + rectangle2.getLength() + " and "
                + rectangle2.getWidth() + " has area " + rectangle2.computeArea());

        // Print the details of each circle
        System.out.println("Circle with radius " + circle1.getRadius() + " has area "
                + circle1.computeArea());

        System.out.println("Circle with radius " + circle2.getRadius() + " has area "
                + circle2.computeArea());

        scanner.close();
    }
}

