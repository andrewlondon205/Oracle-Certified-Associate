import java.util.Scanner;

public class Operators {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int x, y;
        System.out.println("Please enter the first number");
        x = sc.nextInt();
        System.out.println("Now enter the second number");
        y = sc.nextInt();

        logicalOps(x,y);
        simpleMaths(x,y);
        System.out.println(modulus(x,y));
        incrDecr();
    }

    public static void logicalOps (int x, int y) {
        if (x >= 0 && y >= 0)
            System.out.println("Both numbers are positive");
        else if (x < 0 && y < 0)
            System.out.println("Both numbers are negative");
        else if (x < 0 || y < 0)
            System.out.println("One of the numbers is negative");
        else if (x == 0 || y == 0)
            System.out.println("One of the number equates to zero");
    }

    public static void simpleMaths (int x, int y) {
        int sum = x + y;
        int product = x * y;
        int difference = (x < y) ? y - x : x - y;
        int quotient = x / y;

        System.out.println("The sum of " + x + " and " + y +" is " + sum);
        System.out.println("The product of " + x + " and " + y +" is " + product);
        System.out.println("The difference of " + x + " and " + y +" is " + difference);
        System.out.println("The quotient of " + x + " and " + y +" is " + quotient);
    }

    public static boolean modulus (int x, int y) {
        return x % y == 0;
    }

    public static void incrDecr () {
        int x=0, w=0, y=0, z=0; x=4;

        System.out.println(++x);
        System.out.println(x++);
        System.out.println(x);
        System.out.println(--x);
        System.out.println(x--);
        System.out.println(x);

        w=20;
        x=10;
        y=-5;
        z=0;

        System.out.println( w == x && y != z );
        System.out.println( w == x || y != z );
        System.out.println( ! ( w == (x + z) ) );
    }
}
