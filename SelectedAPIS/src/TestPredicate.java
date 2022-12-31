import java.util.function.Predicate;

interface Evaluate <T> {
    boolean isNegative(T t);
}


public class TestPredicate {
    public static void main(String[] args) {
        //Evaluate <T> is a functional interface i.e. one abstract method;
        // boolean isNegative (T t); similar to java.util.function.Predicate
        Evaluate<Integer> lambda = i -> {return i < 0;};
        System.out.println("Evaluate: " + lambda.isNegative(-1));
        System.out.println("Evaluate: " + lambda.isNegative(50));

        Predicate<Integer> predicate = i -> i <0;
        System.out.println("Predicate: " + predicate.test(-1));
        System.out.println("Predicate: " + predicate.test(250));

        int x =4;
        System.out.println("Is " + x + " even? " + check(4, n -> n % 2 == 0));
        x = 7;
        System.out.println("Is " + x + " even? " + check(7, n -> n % 2 == 0));

        String name = "Mr. Joe Bloggs";
        String newname = "Ms. Ann Bloggs";
        System.out.println("Does " + name + " start with Mr. ? " + check("Mr. Joe Bloggs", s -> s.startsWith("Mr.")));
        System.out.println("Does " + name + " start with Mr. ? " + check("Ms. Ann Bloggs", s -> s.startsWith("Mr.")));

    }

    public static <T> boolean check(T t, Predicate<T> lambda) {
        return lambda.test(t);
    }
}
