package ooa;

public class Soccer extends Run implements BallSport{

    public Soccer(Double distanceKm) {
        super(distanceKm);
    }

    @Override
    public void move() {
        System.out.println("Soccer::moving()");
    }
}
