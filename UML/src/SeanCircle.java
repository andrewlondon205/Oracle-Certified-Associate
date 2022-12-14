import java.util.Scanner;

public class SeanCircle {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the radius");
        double radius = sc.nextDouble();

        double diameter = calcDiameter(radius);
        System.out.println("diameter is :" + diameter);

        double circumference= calcCircumference(radius);
        System.out.println("circumference is :" + circumference);

        double area = calcArea(radius);
        System.out.println("area is :" + area);

    }

    public static double calcDiameter(double radius) {
        double diameter = radius * 2;
        return diameter;
    }


    public static double calcCircumference (double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calcArea (double radius) {
        double area = Math.pow(radius,2) * radius;
        return area;
    }

}
