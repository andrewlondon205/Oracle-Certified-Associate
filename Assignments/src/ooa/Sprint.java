package ooa;

public class Sprint extends Run{

    public Sprint(Double distanceKm) {
        super(distanceKm);
    }

    @Override
    public void move() {
        System.out.println("Sprint::moving()");
    }
}
