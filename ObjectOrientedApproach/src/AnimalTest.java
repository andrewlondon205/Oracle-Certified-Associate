
class Creature {
    String name = "Animal";
    public void eat() {System.out.println("Animal::eat()");}
    public static void walk () {System.out.println("Animal::walk()");}
}

class Dog extends Creature {

    String name = "Dog";
    public void eat() {System.out.println("Dog::eat()");}
    public static void walk() {System.out.println("Dog::walk()");} //not an override! hiding.
    public void bark() {System.out.println("Dog::bark()");} // extra method

}

public class AnimalTest {
    public static void main(String[] args) {
        Creature cr = new Creature();
        cr.eat();
        Creature cr2 = new Dog();
        cr2.eat();
        System.out.println(cr2.name);
        cr2.walk();

        Dog dog = (Dog) cr2;
        dog.bark();
    }
}
