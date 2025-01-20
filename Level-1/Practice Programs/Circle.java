public class Circle {
    private double radius;

    // Default aqconstructor
    public Circle() {
        this(1.0); // Calls the parameterized constructor with a default radius of 1.0
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to display
    public double display() {
        return  radius;
    }
}

class UseCircle{
    public static void main(String[] args) {
        // Using the default constructor
        Circle defaultConst = new Circle();
        System.out.println("Radius is: " + defaultConst.display());
        // Using the parameterized constructor
        Circle parameter= new Circle(5.0);
        System.out.println("Radius is: " + parameter.display());
    }
}