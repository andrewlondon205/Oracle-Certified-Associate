public class StringVersusStringBuilder {

    public static void main(String[] args) {

        String vowelsS = "aei";
        // StringBuilder vowelsSB = "aei"; compiler error
        StringBuilder vowelsSB = new StringBuilder("aei");

        addRemainingVowels(vowelsS);
        addRemainingVowels(vowelsSB);

        System.out.println(vowelsS);
        System.out.println(vowelsSB);
    }

    public static void addRemainingVowels (String vowels) {
        vowels += "ou";
        vowels.concat("ou");
    }

    public static void addRemainingVowels (StringBuilder vowels) {
        vowels.append("ou");
    }
}
