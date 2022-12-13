public class Wrappers {

    public static void main(String[] args) {

        /**
         * Parsing a string into int, double and float
         */

        int a = Integer.parseInt("108"); //parseInt returns an int
        double b = Double.parseDouble("67.4"); //parseDouble returns a double
        float c = Float.parseFloat("12.5"); // parseFloat returns a flaot

        /**
         *valueOf() preferred to using constructors (memory)
         */

        Integer i1 = Integer.valueOf(2); //better than using constructors
        Integer i2 = Integer.valueOf("60"); // converting a string into an integer
        Integer i3 = Integer.valueOf("F",16); // "F" treated as hex (base 16)
        System.out.println(i3);

        /**
         * boxing and unboxing
         */

        Integer x = 3;
        int number = Integer.valueOf(x);
        System.out.println(number);


    }
}
