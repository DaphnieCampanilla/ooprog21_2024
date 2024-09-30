public class Circle {
    private static double radius;
    private static double diameter;
    private static double area;

    // Constructor
    public Circle() {
        setRadius(1); 
    }

    // setRadius Method
    public void setRadius(double rad) {
        radius = rad;
        diameter = 2 * radius;
        area = Math.PI * radius * radius;
    }

    // Getter methods
    public static double getRadius() {
        return radius;
    }

    public static double getDiameter() {
        return diameter;
    }

    public static double getArea() {
        return area;
    }
}
