import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Circle a = new Circle();
        Circle b = new Circle();
        Circle c = new Circle();

        System.out.print("Enter the radius for first circle: ");
        double radiusA = input.nextDouble();
        
        a.setRadius(3);
        System.out.println("Radius of the first circle: " + a.getRadius());
        System.out.println("Diameter of the first circle: " + a.getDiameter());
        System.out.println("Area of the first circle: " + a.getArea());
        System.out.println();
        
        System.out.print("Enter the radius for second circle: ");
        double radiusB = input.nextDouble();
        
        b.setRadius(20);
        System.out.println("Radius of the second circle: " + b.getRadius());
        System.out.println("Diameter of the second circle: " + b.getDiameter());
        System.out.println("Area of the second circle: " + b.getArea());

        input.close();
    }
}
