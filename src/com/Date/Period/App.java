package com.Date.Period;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;

/*
 * Java Dönemi sınıfı, yıl, ay ve gün cinsinden süreyi ölçmek için kullanılır
 * 
 * Metodlar:
 * Temporal addTo(Temporal temporal)	Bu süreyi belirtilen geçici nesneye eklemek için kullanılır.
 * long get(TemporalUnit unit)	İstenen birimin değerini almak için kullanılır.
 * int getYears()	Bu sürenin uzunluğunu almak için kullanılır.
 * boolean isZero()	Bu dönemin üç biriminin sıfır olup olmadığını kontrol etmek için kullanılır.
 * Period minus(TemporalAmount amountToSubtract)	Bu sürenin bir kopyasını çıkartılan belirtilen süre ile iade etmek için kullanılır.
 * static Period of(int years, int months, int days)	Birkaç yıl, ay ve günlerini temsil eden bir Dönem elde etmek için kullanılır.
 * Period plus(TemporalAmount amountToAdd)	Bu sürenin bir kopyasını belirtilen süre ile iade etmek için kullanılır.
 */
public class App {
    public static void main(String[] args) {
       //Java Period Örnek: addTo () 
       Period period = Period.ofDays(24);  
    Temporal temp = period.addTo(LocalDate.now());  
    System.out.println(temp);  
       //Java Period Example: of()
        period = Period.of(2017,02,16);  
  System.out.println(period.toString());  
       //Java Period Örnek: minus ()
       Period period1 = Period.ofMonths(4);   
    Period period2 = period1.minus(Period.ofMonths(2));  
    System.out.println(period2);  
       //Java Period Örneği: plus ()
        period1 = Period.ofMonths(4);   
     period2 = period1.plus(Period.ofMonths(2));  
    System.out.println(period2);  
    }
}
