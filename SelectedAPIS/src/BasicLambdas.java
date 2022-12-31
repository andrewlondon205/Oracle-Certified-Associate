interface MyInterface {
    void m(); // a functional interface i.e. It has only one abstract method
}

public class BasicLambdas {
    public static void main(String[] args) {
        // pre-Java 8
        MyInterface myInterface = new MyInterface() {
            @Override
            public void m() {
                System.out.println("MyInterface::m()");
            }
        };
        myInterface.m();

        MyInterface lambda = () -> {
            System.out.println("Lambda Version");
        };
        MyInterface lambda2 = () -> {System.out.println("Alternative version");};
        lambda.m();
        lambda2.m();
    }
}
