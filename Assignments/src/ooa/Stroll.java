package ooa;

public class Stroll extends Walk{

    public Stroll(double distanceKm) {
        super(distanceKm);
    }

    @Override
    public void move() {
        System.out.println("Stoll::moving()");
    }
}
