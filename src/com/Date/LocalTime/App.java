package com.Date.LocalTime;

import java.time.temporal.ChronoUnit; 
import java.time.*;

/*
 * Java LocalTime sınıfı, varsayılan bir saat-dakika-saniye biçimiyle zamanı temsil eden değişmez bir sınıftır. 
 * public final class LocalTime extends Object   
 * implements Temporal, TemporalAdjuster, Comparable<LocalTime>, Serializable  
 * 
 * Methodlar:
 * LocalDateTime atDate(LocalDate date)	Bu zamanı bir LocalDateTime oluşturmak için bir tarihle birleştirmek için kullanılır.
 * int compareTo(LocalTime other)	Bu zamanı başka bir zamana karşılaştırmak için kullanılır.
 * String format(DateTimeFormatter formatter)	Bu süreyi belirtilen biçimlendiriciyi kullanarak biçimlendirmek için kullanılır.
 * int get(TemporalField field)	Belirtilen alanın değerini bu zamandan int olarak almak için kullanılır.
LocalTime minusHours(long hoursToSubtract)	Bu Yerel Zaman diliminin bir kopyasının  belirtilen saat kadar eksiltilen sayısıyla geri döndürülmesi için kullanılır.
LocalTime minusMinutes(long minutesToSubtract)	Bu Yerel Zaman diliminin bir kopyasının  belirlenen dakika kadar eksiltilen sayısıyla geri dönmek için kullanılır.
static LocalTime now()	Geçerli saat dilimini sistem saatinden varsayılan saat diliminde elde etmek için kullanılır.
static LocalTime of(int hour, int minute, int second)	Bir saat, dakika ve saniyeden bir LocalTime örneği almak için kullanılır.
LocalTime plusHours(long hoursToAdd)	Bu Yerel Zaman diliminin bir kopyasının belirtilen saat kadar arttirarak sayısıyla birlikte döndürülmesi için kullanılır.
LocalTime plusMinutes(long minutesToAdd)	Belirtilen dakika sayısı kadar arttirma ile bu LocalTime'ın bir kopyasını döndürmek için kullanılır.
 */
public class App {
     public static void main(String[] args) {
         //Java LocalTime Örnek: now()
    LocalTime time = LocalTime.now();  
    System.out.println(time);  
    //Java LocalTime Example: of()
       LocalTime time4 = LocalTime.of(10,43,12);  
    System.out.println(time4);
    //Java LocalTime Example: minusHours() and minusMinutes()
        LocalTime time1 = LocalTime.of(10,43,12);  
    System.out.println(time1);  
    LocalTime time2=time1.minusHours(2);  
    LocalTime time3=time2.minusMinutes(34);  
    System.out.println(time3);  
    //Java LocalTime Example: plusHours() and plusMinutes()
      time1 = LocalTime.of(10,43,12);  
    System.out.println(time1);  
     time2=time1.plusHours(4);  
     time3=time2.plusMinutes(18);  
    System.out.println(time3); 
    
     ZoneId zone1 = ZoneId.of("Asia/Kolkata");  
    ZoneId zone2 = ZoneId.of("Asia/Tokyo");  
    LocalTime time5 = LocalTime.now(zone1);  
    System.out.println("India Time Zone: "+time5);  
    LocalTime time6 = LocalTime.now(zone2);  
    System.out.println("Japan Time Zone: "+time6);  
    long hours = ChronoUnit.HOURS.between(time5, time6);  
    System.out.println("Hours between two Time Zone: "+hours);  
    long minutes = ChronoUnit.MINUTES.between(time5, time6);  
    System.out.println("Minutes between two time zone: "+minutes);  
  }  
}
