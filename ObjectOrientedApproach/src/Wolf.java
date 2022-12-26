public class Wolf implements Movable{

    // must be public - cannot assign weaker privilages

    @Override
    public void move() {
        System.out.println("Wolf::move()");

    }

    public static void main(String[] args) {
        // s="walk" // cannot change a final variable
        System.out.println(s);
        // cannot refer to an instance member from a static context
        //move();
        new Wolf().move(); // Wolf::move()
    }
}
