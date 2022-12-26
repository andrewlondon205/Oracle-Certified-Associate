public class Test1 {
    static String s;

    public static void main(String[] args) {
      //  int x = s.length();
        int [] a = {1,2,3};
      //  int index = a[-6];

        //int i = Integer.parseInt("2");
        //int j = Integer.parseInt("abc");

        System.out.println(square(3));
        System.out.println(square(-2));
    }

    public static double square(int number) {
        if (number < 0) {
            throw new IllegalArgumentException();
        }
        return Math.pow(number,2);
    }
}
