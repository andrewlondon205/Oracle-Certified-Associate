//Learning Outcomes

/**
 * 1. Scope
 * 2. Classes, fields, methods
 *   - instance, static, overloaded constructors (methods)
 *   - encapsulation
 *   - 'this' reference
 * 3. Object creation, garbage collection.
 */


public class Person {
    private int age;             //instance variable
    private String name;        //instance variable
    private static int count;   // class variable

    //a construtor is a method which has:
    // 1. the same name as the class
    // 2. no return type
    public Person () {
        Person.count++;
    }

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
        Person.count++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    class TestPerson {

        public static void main(String[] args) {
            Person sean = new Person("Sean Kennedy", 43); // :) using two overloaded constructors
            Person mary = new Person();

  //          mary.name = "Name";
            mary.setName("Mary");
            mary.setAge(25);
            System.out.println(Person.getCount());
       //     System.out.println(name);
            String name = "Paul";
            System.out.println(name);
        }

    }
}
