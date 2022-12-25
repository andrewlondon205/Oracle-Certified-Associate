import java.io.IOException;

public class OverloadingRules {

    /**
     * 1. Argument Lists MUST be different. The method signature consists of the method name and the arguments inside
     *    the parentheses(). The names of the arguments does not matter at all.
     * 2. The return type, the accessing privileges and the exception signature are NOT part of the method signature
     *    and therefore, do NOT matter from the viewpoint of method overloading.
     */


    public void m(int i, String s, float f) {}
    public void m (int i, String s) {}
    private int m (int i, float f) {return 1;}
    public void m (float f, String s) throws IOException {}
}
