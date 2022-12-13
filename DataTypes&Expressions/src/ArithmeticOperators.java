public class ArithmeticOperators {
    public static void main(String[] args) {

        /**
         *  + addition
         *  - subtraction
         *  * multiplication
         *  / division (integer division truncates)
         *  % modulus/remainder operator
         */

        int x=10, y = 3;
        int div = x/y;
        int mod = x % y;
        System.out.println(div + " " + mod);
        System.out.println(0 % 3);

        /**
         * *, / and % have a higher precedence than + or - operators.
         * =(assignment) has the lowest precedence and, as a result is performed last
         */

        int res = 3 + 2 * 4;
        System.out.println(res); // 11
        res = (3 + 2) * 4;
        System.out.println(res); // 20
        res = 6 + 4 - 2;
        System.out.println(res); // 8
        res = 10 / 4 * 6;
        System.out.println(res); // 12

        /**
         * Any maths operation involving int types or smaller, results in an int.
         */

        byte b1 = 2, b2 = 3; //compiler knows that the int literals are in range
        // byte b3 = 128;  128 is not in range (-128..+127)
        // byte b4 = b1 + b2 ; must cast int to byte
        byte b6 = (byte) (b1 + b2); // note the brackets
    }
}
