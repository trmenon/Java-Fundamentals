## Package ##
From java.8
import java.time

Earlier it was done using joda depending on java.calendar

## Methods ##
LocalDate.now() : To get current date
LocalTime.now() : To get current time
LocalDateTime.now() : To get current Date and Time
ZonedDateTime.now() : To get current DateTime with zone
DateTimeFormatter.ofPattern("yyyy-MM-dd") : To create formatter object
<DateTimeObject>.format(<FormatterObject>) : To format based on formatter object