public class SwitchStatements {
    public static void main(String[] args) {
        switchExample1("Soccer");
        switchExample1("Ice Hockey");
        switchExample1("UFC");
    }

    public static void switchExample1 (String sport) {
        switch (1) {} //valid

        switch (sport) {
            case "Soccer":
                System.out.println("I play soccer");
                break;
            case "Ice Hockey":
                System.out.println("I play Ice Hockey");
                break;
            default: // move around
                System.out.println("Unknown Sport");
                break;
        }
    }
}

