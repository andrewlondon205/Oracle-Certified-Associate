
interface Portable {
    default void move () {System.out.println("Moving");}
}

class Cheetah implements Portable {
    @Override
    public void move () {
        System.out.println("Moving very fast");
    }
}

class Elephant implements Portable {}

public class TestAnimal {
    public static void main(String[] args) {
        // cannot new an interface type
        //Portable p1 = new Portable();
        Portable cheetah = new Cheetah();
        cheetah.move();
        Portable elephant = new Elephant();
        elephant.move();
    }
}
