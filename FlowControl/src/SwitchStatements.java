public class SwitchStatements {
    public static void main(String[] args) {
        switchExample1("Soccer");
        switchExample1("Ice Hockey");
        switchExample1("UFC");
        switchExample2();

    }

    public static void switchExample1 (String sport) {
        switch (1) {} //valid

        switch (sport) {
            case "Soccer":
                System.out.println("I play soccer");
                break;
            case "Ice Hockey":
                System.out.println("I play Ice Hockey");
                break;
            default: // move around
                System.out.println("Unknown Sport");
                break;
        }
    }

    public static void switchExample2 () {
        var x = (byte) 4; // var is byte => -128,127
        switch (x) {
       //     case -130: // out of range
        //    case 130:  // out of range
        }

        switch (x) {
            case 3:
            case 4: // the compiler will complain if a duplicate label is added
        }

        //This next switch statement outputs:
        // 4
        // 6
        // some other number
        Integer n = Integer.valueOf("4");
        switch (n) {
            case 4: // entry point, keep going until "break"
                System.out.println("4");
            case 6:
                System.out.println("6");
            default:
                System.out.println("Some other number");
        }
    }

    public static void implicitCasting () {
        byte b=4;
        final int ic = 10;
        int i =10;
        final int c;
        c = 20;
        Byte byteW = 30;

        switch (b) {
            case 1+3: // compile-time constant, int -> byte
            case ic: // compile-time constant, int -> byte
/*            case i: // must be a compile-time constant
            case byteW: // must be a compile-time constant
            case c: // must be a compile-time constant*/
        }

    }

}

