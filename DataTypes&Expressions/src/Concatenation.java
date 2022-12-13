public class Concatenation {

    public static void main(String[] args) {

        /**
         * The + operator is used
         * If both operands are numbers, the + operator is the addition. However, if either operand
         * is a string, the + operator becomes a String concatenation operator.
         */

        int a=3, b=2;
        int rest = a + b;
        System.out.println(rest); // 5

        String s = "abc";
        String s1 = a + s;
        String s2 = s + a;
        System.out.println(s1 + " " + s2); // 3abc abc3

        System.out.println("Output is: " + a + b); // output is 32
        System.out.println("Output is: " + (a+b)); // output is 5
    }
}
