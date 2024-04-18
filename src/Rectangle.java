public class Rectangle {
    private double length;
    private double width;

    /**
     * Constructor to initialize the rectangle with specific values.
     * @param length Length of the rectangle.
     * @param width Width of the rectangle.
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Default constructor that sets length and width to 0.
     */
    public Rectangle() {
        this(0, 0);
    }

    // Getters and setters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Computes and returns the area of the rectangle.
     * @return Area of the rectangle.
     */
    public double computeArea() {
        return length * width;
    }
}