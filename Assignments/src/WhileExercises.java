import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class WhileExercises {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // whileLargestSmallest();
        whileHistogram();
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
