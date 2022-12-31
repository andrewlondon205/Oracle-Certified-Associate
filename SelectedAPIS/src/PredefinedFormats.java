import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class PredefinedFormats {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2021, Month.JANUARY,1);
        LocalTime time = LocalTime.of(9,00);
        LocalDateTime dateTime = LocalDateTime.of(date,time);

        System.out.println(date.format((DateTimeFormatter.ISO_LOCAL_DATE) ));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }
}
