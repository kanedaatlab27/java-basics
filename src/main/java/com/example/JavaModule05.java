package com.example;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class JavaModule05 {
    public static void main(String[] args) {  
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.getYear()+"年"+ today.getMonthValue()+"月" +today.getDayOfMonth()+"日"); // 例: 2026
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDate oneWeekLater =today.plusDays(30);
        System.out.println(oneWeekLater);
        LocalDate birthday = LocalDate.of(1998, 3, 15);
        long age = ChronoUnit.YEARS.between(birthday, today);
        System.out.println("あなたは" + age + "歳です");

       


    }
    
}
