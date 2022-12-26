package ooa;

public abstract class Run implements Exercise {

    private double distanceKm;

    public Run (Double distanceKm) {
        this.distanceKm = distanceKm;
    }

    @Override
    public double distanceCovered() {
        return distanceKm;
    }

}
