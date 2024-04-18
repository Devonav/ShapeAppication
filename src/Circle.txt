public class Circle {
    private double radius;

    /**
     * Constructor to initialize the circle with a specific radius.
     * @param radius Radius of the circle.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Default constructor that sets radius to 0.
     */
    public Circle() {
        this(0);
    }

    // Getters and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Computes and returns the area of the circle.
     * @return Area of the circle.
     */
    public double computeArea() {
        return Math.PI * radius * radius;
    }
}