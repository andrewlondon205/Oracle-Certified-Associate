
@FunctionalInterface
interface SampleFI {
    void m() ; // single abstract method (SAM)
}

@FunctionalInterface
interface SampleFI1 {
    void m() ; //SAM
    default void m1 () {} // does not count
    static void m2 () {} // does not count
}

//@FunctionalInterface
interface SampleF2 { } // no SAM

@FunctionalInterface
interface SampleF3 extends SampleF2 {
    void m ();
}

//@FunctionalInterface
interface SampleF4 {
    void m1(); // abstract method
    void m2(); // abstract method
}

interface SampleF5 {
    void m();
    // the exception to the SAM rule
    public abstract String toString (); // does not count
    public boolean equals (Object o); // does not count
    int hashCode(); // does not count
}

public class TestFunctionalInterfaces {

    public void m () {
        TestFunctionalInterfaces t1 = new TestFunctionalInterfaces();
        TestFunctionalInterfaces t2 = new TestFunctionalInterfaces();
        System.out.println(t1.toString());
        System.out.println(t1.hashCode());
        System.out.println(t1.equals(t2));
    }

    public static void main(String[] args) {
        new TestFunctionalInterfaces().m();
    }
}
