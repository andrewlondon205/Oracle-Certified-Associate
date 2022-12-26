interface StaticIface {
    static int m1() {return 4;}
    public static void m2() {}
    //static void m5(); missing method body
}

public class TestSIF implements StaticIface{
    public static void main(String[] args) {
        System.out.println(StaticIface.m1());
        //System.out.println(m1()); error - need "interface_name.m1()"

        new  TestSIF().go();
    }

    public void go () { // works from an instance method too!
        System.out.println(StaticIface.m1());
    }
}
