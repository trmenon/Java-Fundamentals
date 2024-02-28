package core.examples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringDate {
    public static void main(String[] args) {
        String date_string = "2024-01-30";
        LocalDate dat_obj = LocalDate.parse(
            date_string,
            DateTimeFormatter.ISO_DATE
        );
        System.out.println(dat_obj);
    }
}
