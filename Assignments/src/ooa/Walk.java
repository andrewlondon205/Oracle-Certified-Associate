package ooa;

public abstract class Walk implements Exercise {
    private double distanceKm;

    public Walk (double distanceKm) {
        this.distanceKm = distanceKm;
    }

    @Override
    public double distanceCovered () {
        return distanceKm;
    }
}
