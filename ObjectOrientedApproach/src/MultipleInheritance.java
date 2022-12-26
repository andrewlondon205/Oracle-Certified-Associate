
interface One {
    default void foo() {System.out.println("One::foo");}
}

interface Two {
    default void foo() {System.out.println("Two::foo\n");}
}

public class MultipleInheritance implements One, Two{

    @Override
    public void foo() {
        System.out.println("Class:foo");
        One.super.foo();
        Two.super.foo();
    }

    public static void main(String[] args) {

        new MultipleInheritance().foo();
        ((One)new MultipleInheritance()).foo();
    }
}
