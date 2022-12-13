import java.util.Scanner;

public class Circle {

    private double radius;
    private double area;
    private double circumference;
    private double diameter;
    private final double pi = 3.14;

    public Circle() { }

    public Circle (double radius) {
        this.radius = radius;
    }

    public double calcDiameter (double radius) {
        diameter = 2 * radius;
        return diameter;
    }

    public double calcCircumference (double radius) {
        circumference = radius * 2 * pi;
        return circumference;
    }

    public double calcArea (double radius) {
        area = Math.pow(radius,2) * radius;
        return area;
    }

    public static void main(String[] args) {

        Circle c = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, please enter the radius");
        double val = sc.nextDouble();

        System.out.println("Diameter: " + c.calcDiameter(val));
        System.out.println("Circumference: " + c.calcCircumference(val));
        System.out.println("Area: " + c.calcArea(val));
    }
}
