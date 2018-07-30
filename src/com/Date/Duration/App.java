package com.Date.Duration;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/*
 * Java Duration sınıfı saniyeler ve nanosaniye cinsinden süreyi ölçer
 * 
 * Metodlar:
 * Temporal addTo(Temporal temporal)	Bu süreyi belirtilen geçici nesneye eklemek için kullanılır.
 * static Duration between(Temporal startInclusive, Temporal endExclusive)	İki zamansal nesne arasındaki süreyi temsil eden bir Süre elde etmek için kullanılır.
 * long get(TemporalUnit unit)	İstenen birimin değerini almak için kullanılır.
 * boolean isNegative()	Sıfır hariç, bu sürenin negatif olup olmadığını kontrol etmek için kullanılır.
 * boolean isZero()	Bu sürenin sıfır uzunlukta olup olmadığını kontrol etmek için kullanılır.
 * Duration minus(Duration duration)	Bu sürenin bir kopyasının belirtilen süre ile çıkarılması için kullanılır.
 * Duration plus(Duration duration)	Bu sürenin bir kopyasının belirtilen süreye eklenmesi için kullanılır.
 */
public class App {
public static void main(String[] args) {
    //Java Duration Örneği: get ()
      Duration d = Duration.between(LocalTime.NOON,LocalTime.MAX);  
    System.out.println(d.get(ChronoUnit.SECONDS)); 
    
    //Java Süre Örneği: isNegative ()
Duration d1 = Duration.between(LocalTime.MAX,LocalTime.NOON);  
      System.out.println(d1.isNegative());  
      Duration d2 = Duration.between(LocalTime.NOON,LocalTime.MAX);  
              System.out.println(d2.isNegative());     
              
    //Java Süre Örneği: between() 
      d = Duration.between(LocalTime.NOON,LocalTime.MAX);  
    System.out.println(d.get(ChronoUnit.SECONDS));    
    
    //Java Süre Örneği: minus ()
      d1 = Duration.between(LocalTime.NOON,LocalTime.MAX);  
    System.out.println(d1.getSeconds());  
     d2 = d1.minus(d1);  
    System.out.println(d2.getSeconds());  
    
    //Java Süre Örneği: plus ()
         d1 = Duration.between(LocalTime.NOON,LocalTime.MAX);  
    System.out.println(d1.getSeconds());  
     d2 = d1.plus(d1);  
    System.out.println(d2.getSeconds());  
}
}
