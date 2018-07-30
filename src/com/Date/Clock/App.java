package com.Date.Clock;

import java.time.Clock;
import java.time.Duration;

/*
 * ava Saat sınıfı, bir saat dilimini kullanarak mevcut anlık, tarih ve saate erişim sağlamak için kullanılır.
 * public abstract class Clock extends Object  
 * Methodlar:
 * abstract ZoneId getZone()	Tarih ve saatleri oluşturmak için kullanılan zaman dilimini elde etmek için kullanılır.
 * abstract Instant instant()	Mevcut anı yakalamak için kullanılır.
 * static Clock offset(Clock baseClock, Duration offsetDuration)	Belirtilen saatten, belirtilen süre eklenmiş olan, anları döndüren bir saat elde etmek için kullanılır.
 * static Clock systemDefaultZone()	Mevcut anı en uygun sistem saatini kullanarak, varsayılan zaman dilimini kullanarak tarihe ve saate dönüştüren bir saat elde etmek için kullanılır.
 * static Clock systemUTC()	Mevcut anı en iyi sistem saatini kullanarak, UTC saat dilimini kullanarak tarihe ve saate dönüştüren bir saat elde etmek için kullanılır.
 */
public class App {
    public static void main(String[] args) {
        //Java Saat sınıfı Örnek: getZone () 
    Clock c = Clock.systemDefaultZone();      
    System.out.println(c.getZone());  
    
    //Java Saat sınıfı Örnek: instant ()
     c = Clock.systemUTC();  
    System.out.println(c.instant()); 
    
    //Java Saat sınıfı Örnek: systemUTC ()
     c = Clock.systemUTC();  
    System.out.println(c.instant());  

//Java Saat sınıfı Örnek: offset ()
 c = Clock.systemUTC();  
    Duration d = Duration.ofHours(5);  
    Clock clock = Clock.offset(c, d);    
    System.out.println(clock.instant());  
    }
}
