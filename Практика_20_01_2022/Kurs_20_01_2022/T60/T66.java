package Kurs_20_01_2022.T60;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class T66 {
    public static void main(String[] args) {
        LocalDateTime d = LocalDateTime.now();

        System.out.println(d.format(DateTimeFormatter.ISO_DATE) + "\n");

        System.out.println(d.minusDays(60).format(DateTimeFormatter.ISO_DATE));
    }
}
