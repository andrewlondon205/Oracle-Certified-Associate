public final class ImmutablePerson {

    //instance fields are final and private - can only be assigned once
    // (at construction time) - "blank finals"

    private final String name;
    private final int age;

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Joe Bloggs",23);
        System.out.println(p1);

        Person p2 = new Person("Mary Bloggs",24);
        System.out.println(p2);
    }
}
