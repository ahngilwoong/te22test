import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String dateString = "2023-07-05";
        LocalDate originalDate = LocalDate.parse(dateString);
        LocalDate modifiedDate = originalDate.plusDays(1);
        String modifiedDateString = modifiedDate.toString();
        System.out.println(modifiedDateString);  // 출력: '2023-07-06'
    }


}
