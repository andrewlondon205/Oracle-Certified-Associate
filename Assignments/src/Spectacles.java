public class Spectacles {

    private int numLenses;

    public Spectacles () {
        numLenses = 2;
    }

    public int getNumLenses() {
        return numLenses;
    }

    public void setNumLenses(int numLenses) {
        this.numLenses = numLenses;
    }

    @Override
    public String toString() {
        return "Spectacles{" +
                "numLenses=" + numLenses +
                '}';
    }
}
