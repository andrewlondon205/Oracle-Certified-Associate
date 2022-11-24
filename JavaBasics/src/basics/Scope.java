package basics;

public class Scope {
    // class and instance variables go here
    static int count; // class
    int x;            // instance

    public static void main(String[] args) {
        //local variables are method parameters and variables within methods
        int a=1;
        a=2;
        {// this is the start of the block of code
            a=3;
            int b=0;
            b++;
            {
                 b++;
                 a++;
            }
        }//this is the end of the block code
        //b++;
    }

    public static void m1 () {
    //    a = 4;
    }
    public void m2 () {
    //    a = 4;
    }
}
