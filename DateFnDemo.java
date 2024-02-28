package core;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateFnDemo {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate.getClass());
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime.getClass());
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime.getClass());

        ZonedDateTime zonedDateTimeObject = ZonedDateTime.now();
        System.out.println(zonedDateTimeObject);

        DateTimeFormatter dateTimeFormatterObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDateTimeStringObject = currentDateTime.format(dateTimeFormatterObj);
        System.out.println(formattedDateTimeStringObject);
        
    }
}
