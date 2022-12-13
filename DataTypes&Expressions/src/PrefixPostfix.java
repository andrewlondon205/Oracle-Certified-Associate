public class PrefixPostfix {

    public static void main(String[] args) {

        int x=3, y=4;
        x++;
        --y;

        System.out.println(x + " " + y);
        System.out.println(x++ + " " + --y);
        System.out.println(x + " " + y);

        /**
         * As we can see from the output, the main difference is noticed at run time execution
         * if we add the operator before the operand, then it will first decrease or increase
         * the value, and then print it in the console.
         * The opposite happens when the operator is placed after the operand.
         */


    }
}
