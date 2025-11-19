package lesson21;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        LocalDate today = LocalDate.now();

        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfYear());
        System.out.println(today.getMonth());
        System.out.println(today.getMonthValue());
        System.out.println(today.getYear());
        System.out.println(today.isLeapYear());
        System.out.println(today.minusDays(1));
        System.out.println(today.plusDays(1));
        System.out.println(today.minusMonths(1));
        System.out.println(today.plusMonths(1));

        System.out.println("-------------------");

        System.out.println(date);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDate());
        System.out.println(date.getHours());
        System.out.println(date.getMinutes());
        System.out.println(date.getSeconds());
        System.out.println(date.getTime());
        System.out.println(date.compareTo(date));

        System.out.println("-------------------");
    }
}
