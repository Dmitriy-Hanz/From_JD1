package Kurs_20_01_2022;

import java.text.Format;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Scanner;

public class T64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int monthNum = 0;
        try{
            monthNum = sc.nextInt();
            if(monthNum > 12 || monthNum < 1){
                throw new Exception("Такого месяца нет");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        LocalDateTime d = LocalDateTime.now().withMonth(monthNum).withDayOfMonth(1);
        while (d.getMonth().getValue() == monthNum){
            System.out.println(d.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
            d = d.plusDays(1);
        }

    }
}
