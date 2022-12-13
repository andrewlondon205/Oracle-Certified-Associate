public class RelationalLogicalOperators {
    public static void main(String[] args) {

        /**
         * There are 6 relational operators
         *
         * ==
         * !=
         * >
         * <
         * >=
         * <=
         *
         * Relational operators always result in a boolean value (true false)
         *
         */

        System.out.println(5.0 == 5);
        System.out.println(5.1 == 5);
        System.out.println(5.0 == 5L);

        /**
         *  Logical AND &&
         *
         *  boolean expressions as operands
         *  short-circuits && evaluates the left side of the expression first and if it resolves
         *  to false, the right side of the expression is not evaluated because && knows the complete
         *  expression cannot be true, i.e F && T == F
         *
         */

        boolean b1 = false, b2 = true;
        boolean res = b1 && (b2=false); // F &&
        System.out.println(b1 + " " + b2 + " " + res); // false true false

        /**
         * Logical OR i.e ||
         * short-circuits && evaluates the left side of the expression first and if it resolves
         * to true, the right side of the expression is not evaluated because || knows immediately
         * that the complete expression is  true, i.e T || F == T
         */

        boolean a1 = false, a2 = true;
        boolean result = b2 || (a1=true);
        System.out.println(b1 + " " + b2 + " " + result);

        /**
         * Bitwise AND i.e &
         * Boolean expressions as operands (and integral operands)
         * does not short-circuit
         *
         */

        boolean c1 = false, c2 = true;
        boolean res1 = b1 & (b2=false);
        System.out.println(b1 + " " + b2 + " " + res1);

        /**
         * bitwise OR i.e ||
         * Boolean expressions as operands (and integral operands)
         * does not short-circuit
         */

        boolean d1 = true, d2 = true;
        boolean outcome = d2 | (d1=true);
        System.out.println(d1 + " " + d2 + " " + outcome );

        /**
         * Bitwise XOR
         * Boolean expressions as operands (and integral operands)
         * or one the other but not both
         * does NOT short-circuit
         */

        boolean e1 = (5 < 1) ^ (10 < 20); // T ^ F == F
        boolean e2 = (5 < 10) ^ (10 < 20); // T ^ F == F
        System.out.println(b1 + " " + b2);

        byte f1 = 6 & 8;
        byte f2 = 7 | 9;
        byte f3 = 5 ^ 4;

        System.out.println(b1 + " " + b2 + " "  + f3);
    }
 }
