public class JavaDataTypes {
    public static void main(String[] args) {

        char c = 'h'; // chars in single quotes (Unicode 97)
        int number = c; //automatic widening, char into int
        float f = 23; // int into float
        double d = 2.3f; // float into double
        float f1 = 1L; // long promoted to float


        int number2 = (int) 3.3; // double cast to int
        byte b1 = (byte)120; // cast actually not needed
        byte b2 = 120; //compiler knows it literal is in range
     //   float f1 = 3.45; // double to float
        float f2 = (float)3.45;

        char c1 = (short)90; // 'b'
        System.out.println(c1); // prints b in console
        short s1 = 'a'; // 97 is in range of short
        char b = 'a'; // chars in single quotes (unicode 97)
        // short s2 = c; //does not work with a variable (unless c is a compile-time constant)

        /**
         * c2 is "final" i.e. a compile-time constant
         * the compiler can plug in the value now as it will never be changing.
         */

        final char c2 = 'g';
        short s3 = c2;

    }
}
