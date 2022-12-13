public class TernaryOperator {

    /**
     * Ternary Operator _?_:_
     * 3 operands
     * used to evaluate boolean expressions, just like an if statement, except that, instead of
     * executing a block of code if the test is true, a conditional operator will assign a value
     * to a variable
     *
     * the goal of the conditional operator is to decide which of two values to assign to a variable
     * @param args
     */

    public static void main(String[] args) {

        int numPets = 3;
        String status = (numPets < 4) ? "Pet limit not exceeded" : "Too many pets";
        System.out.println(status);

        int sizeOfYard = 7;
        numPets = 6;

        status = (numPets < 4) ? "Pet count is Ok" : (sizeOfYard>8) ? "Pet limit on edge" : "Too many pets";
        System.out.println(status);

        /**
         * Compound Assignment Operators
         *
         * x += y   -> x = x + y
         * x -= y   -> x = x - y
         * x *= y   -> x = x * y
         * x /= y   -> x = x / y
         */

        byte b1 = 3;
        int i = 4;
        // b1 = b1 + i
        b1 += i ;

        int x = 2;

        /**
         * tricky - bearing in mind that * has a higher precedence than +
         * The expression on the RHS is always placed in parentheses and therefore
         * the expression evaluates as x = x * (RHS)
         *
         */

        x *= 2 + 5; // -> x = x * (2 + 5) == 14
        System.out.println(x); // prints 14 not 9

        int k = 1;

        k += (k = 4) * (k + 2); // 25
    }


}
