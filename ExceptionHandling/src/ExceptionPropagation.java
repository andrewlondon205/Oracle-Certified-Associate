public class ExceptionPropagation {

    public static void main(String[] args) {
        a();
    }

    public static void a () {b();}
    public static void b () { c();}
    public static void c () {int x = 7/0;}
}
