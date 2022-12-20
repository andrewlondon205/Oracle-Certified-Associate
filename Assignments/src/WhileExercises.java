import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class WhileExercises {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // whileLargestSmallest();
       // whileHistogram();
       // whileGrades();
      //  whileAverage();
      // thirdOrderPolynomial();
    }

    public static void thirdOrderPolynomial () {
        int a, b, c, d;
        double expression, x;
        String flag;

        System.out.print("Please enter a: ");
        a = sc.nextInt();

        System.out.print("Please enter b: ");
        b = sc.nextInt();

        System.out.print("Please enter c: ");
        c = sc.nextInt();

        System.out.print("Please enter d: ");
        d = sc.nextInt();
        while (true) {

            System.out.println("Now enter an X value");
            x = sc.nextDouble();

            expression = a * Math.pow(x, 3) + b * Math.pow(x,2) + c * x + d;

            System.out.println("Do you want to continue: Please press Y or N");
            flag = sc.next();
            if (flag.equals("N"))
                break;
        }
        System.out.println(expression);
    }

    public static void whileAverage () {
        double average, number, sum = 0;
        int n, index = 0;
        System.out.println("How many numbers do you want to work with?");
        n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid Number");
        }
        else {
            while (index < n) {
                System.out.print("Enter a number : ");
                number = sc.nextDouble();
                sum += number;
                index++;
            }
            average = sum / n;
            System.out.println("The average is " + average);
        }
    }

    public static void whileGrades () {
        int A = 0, B = 0, C = 0, D = 0, E = 0, F = 0;
        String grade = "";

        while(!grade.equals("x")) {
            System.out.println("Enter a grade please");
            grade = sc.next();
            grade = grade.toLowerCase();
            switch(grade) {
                case "a":
                    A++;
                    break;
                case "b":
                    B++;
                    break;
                case "c":
                    C++;
                    break;
                case "d":
                    D++;
                    break;
                case "e":
                    E++;
                    break;
                case "f":
                    F++;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }

        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
        System.out.println("E: " + E);
        System.out.println("F: " + F);
    }

    public static void whileHistogram() {
        int rows, columns, y=0;
        System.out.println("Please enter a rows value");
        rows = sc.nextInt();
        System.out.println("Please enter a columns value");
        columns = sc.nextInt();

        while(y < rows) {
            int x=0;
            while (x < columns) {
                System.out.print(" * ");
                x++;
            }
            System.out.println();
            y++;
        }
    }

    public static void whileLargestSmallest() {

        int index = 0, n, number;
        Integer min = MIN_VALUE;
        Integer max = MAX_VALUE;

        System.out.println("How many numbers do you want to work with?");
        n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number");
        }
        else{
            while (index < n) {
                System.out.println("Enter a number ");
                number = sc.nextInt();
                if (number > min )
                    min = number;
                if (number < max)
                    max = number;
                index++;
            }
            System.out.println("Largest is: " + min);
            System.out.println("Smallest is: " + max);
        }
    }
}
