
class Dog {
    Dog () {
        super();
    }
} // will get a default constructor

class Cat {
    Cat () { } // no-arg constructor
}

class Mouse {
    private String name;

    Mouse () {
        name = "";
    }

    Mouse (String aName) {
        name = aName;
    }

    void Mouse () {} // this is not a constructor
}


public class Constructors {

    public static void main(String[] args) {
        Dog d = new Dog(); // no error
        Cat c = new Cat();
        Mouse m1 = new Mouse();
        Mouse m2 = new Mouse("Nibbles");
    }

}
