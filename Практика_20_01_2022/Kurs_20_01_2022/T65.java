package Kurs_20_01_2022;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class T65 {
    public static void main(String[] args) {
        LocalDateTime d = LocalDateTime.now();

        if (d.getHour() < 13){
            d = d.withHour(13).withMinute(0);
        }
        else{
            d = d.withHour(13).withMinute(0).plusDays(7);
        }
        do {
            System.out.println(d.format(new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm").toFormatter()));
            d = d.plusDays(7);
        } while (d.getMonth().getValue() < LocalDateTime.now().getMonth().getValue() + 2);
    }


}
