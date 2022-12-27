import java.io.FileNotFoundException;

class Base {
    void m() throws FileNotFoundException {
        System.out.println("Base::m()");
    }
}

class Sub extends Base {
    void m () { //Ok, none is a valid subset
        /**
         * void m() throws FileNotFoundException  ok, exact same Exception signature
         * void m() throws NullPointerException, ok, can throw any unchecked exception
         * void m() throws EOException, // error, Base::m() does not throw checked exception
         * void m() throws IOException, // error, trying to throw extra checked exceptions
         */
        System.out.println("Sub::m()");
    }
}

public class Q20 {
    public static void main(String[] args) {
        Base b = new Sub();
        /**
         * Explanation: the compiler always looks at the reference type - Base in this example. Thus, the compiler works
         * off the signature of m() in base. However, at run time, we are dynamically binding (polymorphism) to the
         * object Sub. If the overriding method in Sub was allowed to throw extra checked exceptions that the compiler
         * was not excepting ... Remember, the compiler has verified the code based on the Exception signature of m()
         * in Base and NOT Sub!
         */
        try {
            b.m();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }
}

