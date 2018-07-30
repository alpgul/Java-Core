package com.Date.Month;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

/*
 * Java'da Ay, yılın 12 ayı temsil eden bir numaradır. 
 * Metinsel enum adına ek olarak, yılın her ayı için bir int değeri vardır.
 * 
 * Metodlar:
 * int getValue()	Yıl içi int değerini almak için kullanılır
 * int get(TemporalField field)	Belirtilen alanın değerini bu yıldan itibaren bir int olarak almak için kullanılır.
 * int length(boolean leapYear)	Bu ayın uzunluğunu günler içerisinde almak için kullanılır.
 * int maxLength()	Bu ayın maksimum uzunluğunu günler içerisinde almak için kullanılır.
 * int minLength()	Bu ayın minimum uzunluğunu günler içerisinde almak için kullanılır.
 * Month minus(long months)	Bu ayın belirtilen ay sayısı olan ayın iadesi için kullanılır.
 * Month plus(long months)	Bundan sonraki çeyrekte belirtilen yıl olan yıla geri dönmek için kullanılır.
 * static Month of(int month)	Bir int değerinden Month örneğini elde etmek için kullanılır.
 */
public class App {
    public static void main(String[] args) {
        //Java Month enum Örneği
     Month month = Month.valueOf("January".toUpperCase());  
        System.out.printf("For the month of %s all Sunday are:%n", month);  
        LocalDate localdate = Year.now().atMonth(month).atDay(1).  
        with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));  
        Month mi = localdate.getMonth();  
        while (mi == month) {  
            System.out.printf("%s%n", localdate);  
            localdate = localdate.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));  
            mi = localdate.getMonth();  
        }     
        
        //Java Month enum Örnek: getValue ()
 month = Month.from(LocalDate.now());  
    System.out.println(month.getValue());  
    System.out.println(month.name());
    
        //Java Month enum Örnek: minus ()
          month = Month.from(LocalDate.now());    
    System.out.println(month.minus(2));  
    
        //Java Month enum Örnek: plus ()
          month = Month.from(LocalDate.now());    
    System.out.println(month.plus(2));  
    
        //Java Month enum Örnek: length ()
         month = Month.from(LocalDate.now());    
    System.out.println("Total Number of days: "+month.length(true));  
    }
}
