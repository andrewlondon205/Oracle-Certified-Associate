
class A {
    static {System.out.println("static A1");}
    {System.out.println("instance A1");}
    public A () {}
    public A (int i) {System.out.println(i + "\n");}
    static {System.out.println("static A2");}
    {System.out.println("instance A2");}
}

class B {
    static {System.out.println("static B");}
    static A s1 = new A(1);
    A a = new A(2);
    static A s2 = new A(4);
    {System.out.println("instance B");}
}


public class Q2_1170 {

    public static void main(String[] args) {
        B b = new B();
        A a = new A(3);

    }

}
