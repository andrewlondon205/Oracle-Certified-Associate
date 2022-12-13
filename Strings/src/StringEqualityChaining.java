public class StringEqualityChaining {

    public static void main(String[] args) {

        String name1 = "Sean";
        String name2 = "Sean";
        System.out.println(name1 == name2); //true because the references are the same

        String name3 = new String("Sean");
        System.out.println(name1 == name3); //false because the references are different
        System.out.println(name1.equals(name3)); //true because the object contents are the same
        System.out.println(name1 == new String("Sean").intern()); // prints true

        String s = "react".concat("angular").toUpperCase().replace('e','f');
        System.out.println(s);
    }
}
