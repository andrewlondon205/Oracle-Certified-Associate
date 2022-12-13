public class Casting {
    public static void main(String[] args) {

        //unary operators (one operand)
        int x = +6;
        int y = -x;

        int z = (int) 3.45;
        System.out.println(z); //prints 3

        boolean b = true;
        System.out.println(!b); //prints false and the "!" cannot be applied to other data types other than boolean
    }
}
