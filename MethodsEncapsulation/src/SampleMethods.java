public class SampleMethods {

    public static void main(String[] args) {

        int sum = performCalc(3,4);
        System.out.println(sum);
        sum = performCalc(5,7);
        System.out.println(sum);
        sum = performCalc(2,9);
        System.out.println(sum);

        double sumD = performCalc(5.0,6.0);
        System.out.println(sumD);
        
    }

    public static int performCalc (int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static double performCalc (double x, double y) {
        double sum = x + y;
        return sum;
    }

}
