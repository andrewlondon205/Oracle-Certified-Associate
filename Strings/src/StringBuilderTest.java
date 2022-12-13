public class StringBuilderTest {

    public static void main(String[] args) {

        String x = "abc";
        x.concat("def");
        System.out.println(x); // prints abc

        String x1 = "abc";
        x1 = x1.concat("def");
        System.out.println(x1); // abcdef, but abc lost

        //StringBuilder does the same thing without wasting memory

        StringBuilder sb = new StringBuilder("abc");
        sb.append("def");
        System.out.println(sb);  // abcdef

        StringBuilder sb2 = new StringBuilder("abc");
        sb2.append("def").reverse().insert(3,"---");
        System.out.println(sb2); // prints fed---cba

        StringBuilder sb4 = new StringBuilder();
        System.out.println(sb4.length()); //0
        System.out.println(sb4.capacity()); // 16
        sb4.append("1234"); //length is now 4
        sb4.insert(1,"x"); //index must <= length
        System.out.println(sb4.toString()); // 1x234
        System.out.println(sb4.length()); // 5
        System.out.println(sb4.capacity()); // 16
        sb4.append("1234567890123456");
        System.out.println(sb4.toString()); // 1x23411234567890123456
        System.out.println(sb4.length()); //21
        System.out.println(sb4.capacity()); // 34 (2 * 16 + 2)

        sb4.insert(19,"y"); // Ok, 19 <= 21
        System.out.println(sb4.toString()); // 1x234112345678901234y56
        System.out.println(sb4.length()); // 22

        sb4.insert(22,"z");
        System.out.println(sb4.toString());
        System.out.println(sb4.length());

        // index cannot be greater than the ***length***
       // sb4.insert(24,"p"); //throws an StringIndexOutOfBoundsException

    }
}
