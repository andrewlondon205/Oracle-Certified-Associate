public class AccessModifiers {

    public static void main(String[] args) {
        int age = 20;
        Adult john = new Adult("John",20);
        change(john,age);
        System.out.println(john.getName() + " " + age);

    }

    public static void change(Adult adult, int age) {
        age = 90;
        adult.setName("Michael");
    }
}
