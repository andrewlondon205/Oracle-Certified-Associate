public class StringExample {

    public static void main(String[] args) {
        refsVersusObjects();
    }

    public static void refsVersusObjects () {
        String s1 = "abc";
        String s2 = s1;
        //both references to the same object

        s1 = s1.concat("def");
        System.out.println(s1 + " " + s2);

        String s3 = "Java";
        s3.concat(" 11 Certification");
        System.out.println(s3); // java
    }
}
