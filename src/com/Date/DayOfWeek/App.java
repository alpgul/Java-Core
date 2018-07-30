package com.Date.DayOfWeek;

import java.time.*;
import java.time.temporal.ChronoField;

/*
 * Java'da DayOfWeek, haftanın 7 günü temsil eden bir numaradır. 
 * Metinsel enum adına ek olarak, haftanın her günü int değerine sahiptir.
 * 
 * Metodlar:
 * int get(TemporalField field)	Belirtilen alanın değerini bu haftadan güne int olarak almak için kullanılır.
 * boolean isSupported(TemporalField field)	Belirtilen alanın desteklenip desteklenmediğini kontrol etmek için kullanılır.
 * DayOfWeek minus(long days)	Haftanın gününü, bu tarihten  belirtilen gün sayısı kadar eksilterek döndürmek için kullanılır.
 * DayOfWeek plus(long days)	Haftanın gününü, bu tarihten  belirtilen gün sayısı kadar arttırarak döndürmek için kullanılır.
 * static DayOfWeek of(int dayOfWeek)	Bir int değerinden DayOfWeek örneğini elde etmek için kullanılır.static DayOfWeek[] values()	Bu enum türünün sabitlerini içeren bir diziyi, bildirildikleri sırayla döndürmek için kullanılır.
 */
public class App {
    public static void main(String[] args) {
        //Java DayOfWeek Örnek: get ()
          LocalDate localDate = LocalDate.of(2017, Month.JANUARY, 25);  
    DayOfWeek dayOfWeek = DayOfWeek.from(localDate);  
    System.out.println(dayOfWeek.get(ChronoField.DAY_OF_WEEK));  
        //Java DayOfWeek Örnek: of()
 DayOfWeek day = DayOfWeek.of(5);  
    System.out.println(day.name());  
    System.out.println(day.ordinal());  
    System.out.println(day.getValue());          
        //Java DayOfWeek Örnek: plus()
        LocalDate date = LocalDate.of(2017, Month.JANUARY, 31);  
     day = DayOfWeek.from(date);  
    System.out.println(day.getValue());  
    day = day.plus(3);  
    System.out.println(day.getValue());  
        //Java DayOfWeek Örnek: minus ()
         date = LocalDate.of(2017, Month.JANUARY, 31);  
     day = DayOfWeek.from(date);  
    System.out.println(day.getValue());  
    day = day.minus(3);  
    System.out.println(day.getValue());  
    }
}
