class Person {
    private String theName;
    private static int count;

    Person(String aName) {
        theName = aName;
        Person.count++;
    }

    public static int getCount () {
        return Person.count;
    }

    public String getName() {
        return theName;
    }

    public void setName(String name) {
        this.theName = name;
    }
}

public class TestPerson {

    public static void main(String[] args) {
        Person p1 = new Person("Ramai");
        Person p2 = new Person("Mary");
        System.out.println(Person.getCount());
        System.out.println(Person.getCount());
    }
}
