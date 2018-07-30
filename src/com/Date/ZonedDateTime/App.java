package com.Date.ZonedDateTime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
 * Java ZonedDateTime sınıfı, bir zaman dilimi ile tarih zamanının değişmez bir temsilidir. Object sınıfını devralır ve ChronoZonedDateTime arabirimini uygular.
 * ZonedDateTime sınıfı, tüm tarih ve zaman alanlarını, nanosaniye hassasiyetine ve belirsiz yerel tarih zamanlarını işlemek için kullanılan bir bölge ofsetine sahip bir saat diliminde depolamak için kullanılır.
 * 
 * Methodlar:
 * String format(DateTimeFormatter formatter)	Belirtilen biçimlendiriciyi kullanarak bu tarih zamanını biçimlendirmek için kullanılır.
 * int get(TemporalField field)	Belirtilen alanın değerini bu tarih-saatten int olarak almak için kullanılır.
 * ZoneId getZone()	'Asya / Kalküta' gibi zaman dilimini elde etmek için kullanılır.
 * ZonedDateTime withZoneSameInstant(ZoneId zone)	Bu tarih-saatin bir kopyasını, farklı bir zaman dilimi ile, anı korumak için kullanılır.
 * static ZonedDateTime	now()	Geçerli tarih-saatini sistem saatinden varsayılan zaman diliminde elde etmek için kullanılır.
 * static ZonedDateTime	of(LocalDate date, LocalTime time, ZoneId zone)	Yerel bir tarih ve saatten bir ZonedDateTime örneği elde etmek için kullanılır.
 * ZonedDateTime minus(long amountToSubtract, TemporalUnit unit)	Bu tarih-saatinin bir kopyasını çıkarılan miktarda birlikte iade etmek için kullanılır.
 * ZonedDateTime plus(long amountToAdd, TemporalUnit unit)	Bu tarih-saatin bir kopyasını eklenen miktarla birlikte iade etmek için kullanılır.
 */
public class App {
    public static void main(String[] args) {
        //Java ZonedDateTime sınıfı Örnek
        ZonedDateTime zone = ZonedDateTime.parse("2016-10-05T08:20:10+05:30[Asia/Kolkata]");  
    System.out.println(zone); 

//Java ZonedDateTime class Example: of() and withZoneSameInstant()
LocalDateTime  ldt = LocalDateTime.of(2017, Month.JANUARY,  19,   15,   26);  
    ZoneId  india = ZoneId.of("Asia/Kolkata");   
    ZonedDateTime zone1  = ZonedDateTime.of(ldt, india);   
    System.out.println("In India Central Time Zone: " + zone1);  
    ZoneId  tokyo = ZoneId.of("Asia/Tokyo");   
    ZonedDateTime zone2   = zone1.withZoneSameInstant(tokyo);   
    System.out.println("In Tokyo Central Time Zone:"  + zone2); 
    
    //Java ZonedDateTime sınıfı Örnek: getZone ()
    
     zone =ZonedDateTime.now();  
    System.out.println(zone.getZone());  
    
    //    Java ZonedDateTime sınıfı Örnek: minus ()
 zone= ZonedDateTime.now();  
    ZonedDateTime m = zone.minus(Period.ofDays(126));  
    System.out.println(m);  
    
//Java ZonedDateTime class Example: plus()
zone= ZonedDateTime.now();  
    ZonedDateTime p = zone.plus(Period.ofDays(126));  
    System.out.println(p);  
    }
}
