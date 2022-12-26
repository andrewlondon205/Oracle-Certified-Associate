interface I1 {
    default int m() {return 1; }
}

interface I2 {
    default int m () {return 2;}
}

public class MultipleInheritanceTest implements I1, I2{
    public static void main(String[] args) {

        new MultipleInheritanceTest().go();
    }

    void go () {System.out.println(m());}

    @Override
    public int m () {
        return 3;
    }
}
