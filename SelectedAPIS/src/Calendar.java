import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Calendar {
    public static void main(String[] args) {

        LocalDate nowDate = LocalDate.now();
        LocalTime nowTime = LocalTime.now();
        LocalDateTime nowDateTime = LocalDateTime.of(nowDate,nowTime);

        System.out.println("It is now " + nowDateTime + " here.");

        LocalDate stPatricksDay1 = LocalDate.of(2022,3,17); // one way
        LocalDate stPatricksDay2 = LocalDate.parse("2022-03-17"); // another way

        //Output: St. Patricks Day 2022-03-17; 2022-03-17
        System.out.println("St. Patricks Day " + stPatricksDay1 + "; " + stPatricksDay2);

        LocalTime lectureBegins = LocalTime.of(9,0);
        LocalTime lectureEnds = LocalTime.parse("11:00");

        //Output: Lecture begins at 09:00 and ends at 11:00
        System.out.println("Lecture begins at " + " and ends at " + lectureEnds);
    }
}
