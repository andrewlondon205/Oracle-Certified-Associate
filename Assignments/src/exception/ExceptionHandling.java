package exception;

import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) throws IOException, NoSuchMethodException {

        var a = a();
        var b = b();
        var c = c();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        Parent p = new Child();
        p.process();

    }

    public static String a() {
        try {
        } catch (Exception e) {
            System.out.println("Exception occurred");
            return "exception";
        }
        finally {
            System.out.println("finally section...");
            return "finally";
        }
    }

    public static String b() {
        try {
            return "ok";
        }
        catch (Exception e2) {
            System.out.println("Exception occurred");
            return "exception";
        }finally {
            System.out.println("finally section...");
            return "finally";
        }
    }

    public static String c () {
        try {
            throw new Exception("MyException");
        } catch (Exception e3) {
            System.out.println("Exception occurred");
            return "exception";
        } finally {
            System.out.println("finally section...");
            return "finally";
        }
    }

    public static String d () {
        try {
            return "ok";
        } catch (RuntimeException e ) {
            System.out.println("My Exception");
        }
        return "Ok"; // RuntimeException and Exception being unchecked exceptions won't cause any problems
    }
}
