enum WorkDay {
    //values must be first
    MONDAY("9-5"),
    TUESDAY("9-5"),
    WEDNESDAY("9-5"),
    THURSDAY("9-5"),
    FRIDAY("9-5"),
    SATURDAY("10-1") {
        public String getWorkLocation() {return "Home";}
    },
    SUNDAY("10-1") {
        public String getWorkLocation() {return "Home";}
    };
    private final String hoursOfWork;
    private WorkDay(String hoursOfWork) {
        this.hoursOfWork = hoursOfWork;
    }

    public String getHoursOfWork () {return hoursOfWork;}
    public String getWorkLocation () {return "office";}

}

public class ComplexEnums {
    public static void main(String[] args) {
        WorkDay monday = WorkDay.MONDAY;
        System.out.println(monday.getHoursOfWork() + ", " + monday.getWorkLocation());
        System.out.println(WorkDay.SUNDAY.getHoursOfWork() + ", " + WorkDay.SUNDAY.getWorkLocation());
    }
}
