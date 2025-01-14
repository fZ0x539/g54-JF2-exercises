package se.lexicon;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeDateExercises {

    public static void main(String[] args) {


        ex16();
    }

    public static void ex1(){
        var today = LocalDate.now();
        System.out.println(today);
    }
    public static void ex2(){
        var currentDayFormatted = LocalDate.now().format(DateTimeFormatter.ofPattern("eeee dd MMMM"));
        System.out.println(currentDayFormatted);
    }
    public static void ex3(){
        var lastMonday = LocalDate.now().minusWeeks(1).minusDays(1);
        for(int d = 0; d < 7; d++)
            System.out.println(lastMonday.plusDays(d));
    }
    public static void ex4(){
        var today = LocalDate.parse("2025-01-14");
        System.out.println(today);
    }
    public static void ex5(){
        var birthDate = LocalDate.parse("1998-02-05");
        System.out.println("I was born on a " + birthDate.getDayOfWeek());
    }
    public static void ex6(){
        var currentDatePlus = LocalDate.now().plusYears(10).minusMonths(10);
        System.out.println(currentDatePlus);
    }
    public static void ex7(){
        var futureDate = LocalDate.now().plusYears(10).minusMonths(10);
        var birthDate = LocalDate.parse("1998-02-05");
        var period = Period.between(birthDate, futureDate);
        System.out.println(period.getYears() + " Years, " + period.getMonths() + " Month(s), " + period.getDays() + " Day(s)");
    }
    public static void ex8(){
        var period = Period.of(4,7,29);
        var currentDate = LocalDate.now();
        var datePlusPeriod = currentDate.plus(period);
        System.out.println(datePlusPeriod);
    }
    public static void ex9(){
        var currentTime = LocalTime.now();
        System.out.println(currentTime);
    }
    public static void ex10(){
        var time = LocalTime.now();
        System.out.println(time.getNano() + " Nanoseconds");
    }
    public static void ex11(){
        var parsedTime = LocalTime.parse("13:28:30");
        System.out.println(parsedTime);
    }
    public static void ex12(){
        var formattedTime = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(formattedTime);
    }
    public static void ex13(){
        var dateAndTime = LocalDateTime.parse("2018-04-05T10:00:00");
        var formattedDateAndTime = dateAndTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        System.out.println("Regular DnT: " + dateAndTime);
        System.out.println("Formatted DnT: " + formattedDateAndTime);

    }
    public static void ex14(){
        var dateAndTime = LocalDateTime.parse("2018-04-05T10:00:00");
        var formattedDateAndTime = dateAndTime.format(DateTimeFormatter.ofPattern("eeee d MMMM HH:mm"));
        System.out.println(formattedDateAndTime);
    }
    public static void ex15(){
        var localDate = LocalDate.now();
        var localTime = LocalTime.now();
        var dateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("Current date and time: " + dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
    }
    public static void ex16(){
        var dntFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        var dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        var timeFormat = DateTimeFormatter.ofPattern("HH:mm");

        var dateNTime = LocalDateTime.now();
        var localDate = dateNTime.toLocalDate();
        var localTime = dateNTime.toLocalTime();
        System.out.println("LocalDateTime: " + dateNTime.format(dntFormat));
        System.out.println("LocalDate: " + localDate.format(dateFormat));
        System.out.println("LocalTime: " + localTime.format(timeFormat));

    }

}
