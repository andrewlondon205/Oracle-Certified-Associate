public class CallByValue {

    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        passPrimitive(x);
        System.out.println(x);

        x = passPrimitiveAndReturn(x);
        System.out.println(x);

        Spectacles specs = new Spectacles();
        System.out.println(specs.getNumLenses());
        passObjectReference(specs);
        System.out.println(specs.getNumLenses());

    }

    public static void passPrimitive(int value) {
        value = 50;
    }

    public static int passPrimitiveAndReturn(int value) {
        value = 50;
        return value;
    }

    public static void passObjectReference(Spectacles spectacle) {
        spectacle.setNumLenses(9);
    }
}
