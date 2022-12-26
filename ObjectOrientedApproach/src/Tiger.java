class Tag {}

public class Tiger {

    Tag tag;
    String country;

    public static void main(String[] args) {
        Tiger tiger1 = new Tiger();
        Tiger tiger2 = tiger1;
        tiger2.tagAnimal(tiger1);
    }

    void tagAnimal (Tiger tiger) {
        tag = new Tag();
        tiger.setCountry("France");
    }

    void setCountry (String country) {
        this.country = country;
    }
}
