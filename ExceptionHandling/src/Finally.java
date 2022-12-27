
public class Finally {
    public static void main(String[] args) {
/*        try {
            int x = -8;
            System.out.println("protected code 1");
            if (x < 0) {
                throw new RuntimeException();
            }
            System.out.println("protected code 2");
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
        System.out.println("continuing on ...");*/
        String s = m();
        System.out.println(s);
    }

    public static String m () {
        String s = "";
        try {
            s = "ok";
            return s;
        } catch (Exception e) {
            s = "catch";
            return s;
        } finally {
            s = "finally";
            return s;
        }
    }
}
