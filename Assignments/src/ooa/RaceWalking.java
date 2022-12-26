package ooa;

public class RaceWalking extends Walk implements OlympicSport{

    public RaceWalking(double distanceKm) {
        super(distanceKm);
    }

    @Override
    public void move() {
        System.out.println("RaceWalking::moving()");
    }
}
