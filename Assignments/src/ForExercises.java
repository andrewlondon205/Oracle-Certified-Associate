import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ForExercises {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // forLargestSmallest();
       // forHistogram();
      //  forAverage();
        twelveDaysOfChristmas();
    }

    public static void forLargestSmallest() {
        int number, n, index =1;
        System.out.println("How many numbers do you want to work with?");
        n = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i=0; i<n; i++) {
            System.out.println("Enter the number " + index);
            number = sc.nextInt();
            numbers.add(number);
            index++;
        }
        System.out.println("The largest number is " + numbers.stream().max(Comparator.comparing(Integer::valueOf)).get());
        System.out.println("The smallest number is " + numbers.stream().min(Comparator.comparing(Integer::valueOf)).get());
    }

    public static void forHistogram() {
        int rows, columns;
        System.out.println("Enter the number of rows");
        rows = sc.nextInt();
        System.out.println("Now enter the number of columns");
        columns = sc.nextInt();

        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < columns; x++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void forAverage() {
        double number;
        int n, index =1;
        System.out.println("How many numbers do you want to work with?");
        n = sc.nextInt();
        List<Double> numbers = new ArrayList<>();
        for (int i=0; i<n; i++) {
            System.out.println("Enter the number " + index);
            number = sc.nextDouble();
            numbers.add(number);
            index++;
        }
        System.out.println("The average is " + numbers.stream().mapToDouble(a -> a).average().orElse(0));
    }

    private static String getContent(String filepath) throws IOException {
        Path fname = Path.of(filepath);
        String content = Files.readString(fname);
        return content;
    }

    public static void twelveDaysOfChristmas() throws IOException {

        List<String> days = List.of("first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth");
        for (String day: days) {
            switch (day) {
                case "first":
                    System.out.println("On the " + day +" day of Christmas," );
                    System.out.println("My true love sent to me:\n");
                    System.out.println(getContent("Assignments/src/resources/first.txt"));
                    System.out.println();
                    break;
                case "second":
                    System.out.println("On the " + day +" day of Christmas," );
                    System.out.println("My true love sent to me:\n");
                    System.out.println(getContent("Assignments/src/resources/second.txt"));
                    System.out.println();
                    break;
                case "third":
                    System.out.println("On the " + day +" day of Christmas," );
                    System.out.println("My true love sent to me:\n");
                    System.out.println(getContent("Assignments/src/resources/third.txt"));
                    System.out.println();
                    break;
                case "fourth":
                    System.out.println("On the " + day +" day of Christmas," );
                    System.out.println("My true love sent to me:\n");
                    System.out.println(getContent("Assignments/src/resources/fourth.txt"));
                    System.out.println();
                    break;
                case "fifth":
                    System.out.println("On the " + day +" day of Christmas," );
                    System.out.println("My true love sent to me:\n");
                    System.out.println(getContent("Assignments/src/resources/fifth.txt"));
                    System.out.println();
                    break;
                case "sixth":
                    System.out.println("On the " + day +" day of Christmas," );
                    System.out.println("My true love sent to me:\n");
                    System.out.println(getContent("Assignments/src/resources/sixth.txt"));
                    System.out.println();
                    break;
                case "seventh":
                    System.out.println("On the " + day +" day of Christmas," );
                    System.out.println("My true love sent to me:\n");
                    System.out.println(getContent("Assignments/src/resources/seventh.txt"));
                    System.out.println();
                    break;
                case "eighth":
                    System.out.println("On the " + day +" day of Christmas," );
                    System.out.println("My true love sent to me:\n");
                    System.out.println(getContent("Assignments/src/resources/eighth.txt"));
                    System.out.println();
                    break;
                case "ninth":
                    System.out.println("On the " + day +" day of Christmas," );
                    System.out.println("My true love sent to me:\n");
                    System.out.println(getContent("Assignments/src/resources/ninth.txt"));
                    System.out.println();
                    break;
                case "tenth":
                    System.out.println("On the " + day +" day of Christmas," );
                    System.out.println("My true love sent to me:\n");
                    System.out.println(getContent("Assignments/src/resources/tenth.txt"));
                    System.out.println();
                    break;
                case "eleventh":
                    System.out.println("On the " + day +" day of Christmas," );
                    System.out.println("My true love sent to me:\n");
                    System.out.println(getContent("Assignments/src/resources/eleventh.txt"));
                    System.out.println();
                    break;
                case "twelfth":
                    System.out.println("On the " + day +" day of Christmas," );
                    System.out.println("My true love sent to me:\n");
                    System.out.println(getContent("Assignments/src/resources/twelfth.txt"));
                    System.out.println();
                    break;
            }
        }
    }
}
