public class TestExceptions {
    public static void main(String[] args) {
        try {
            spillTea();
            System.out.println("Will never get here!");
        } catch (RuntimeException rte) {
            getAnotherCup();
        }
        enjoyRestOfVideo();
    }

    public static void spillTea() {
        System.out.println("Spilling tea... ");
        throw new RuntimeException();
    }

    public static void getAnotherCup () {
        System.out.println("Getting another cup");
    }

    public static void enjoyRestOfVideo() {
        System.out.println("Enjoying rest of video");
    }
}
