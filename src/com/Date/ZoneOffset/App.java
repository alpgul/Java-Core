package com.Date.ZoneOffset;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;

/*
 * Java ZoneOffset sınıfı:
 * Java ZoneOffset sınıfı, UTC saat diliminden sabit bölge ofsetini göstermek için kullanılır. ZoneId sınıfını miras alır ve Karşılaştırılabilir arabirimi uygular.
 * ZoneOffset sınıfı üç sabit bildirir:
 * MAX: Maksimum desteklenen bölge ofsetleri.
 * MIN: Minimum desteklenen bölge ofsetleri.
 * UTC: UTC için saat dilimi ofset sabiti.
 * 
 * Metodlar:
 * Temporal adjustInto(Temporal temporal)	Belirtilen geçici nesneyi, bu nesne ile aynı ofset olacak şekilde ayarlamak için kullanılır.
 * int get(TemporalField field)	Belirtilen alanın değerini bu uzaklıktan int olarak almak için kullanılır.
 * boolean isSupported(TemporalField field)	Belirtilen alanın desteklenip desteklenmediğini kontrol etmek için kullanılır.
 * static ZoneOffset of(String offsetId)	ID kullanarak ZoneOffset'in bir örneğini elde etmek için kullanılır.
 * static ZoneOffset ofHours(int hours)	Bir ofset kullanarak saat cinsinden bir ZoneOffset örneği elde etmek için kullanılır.
 * static ZoneOffset ofHoursMinutes(int hours, int minutes)	Bir ofset kullanarak saat ve dakikalarda ZoneOffset örneğini elde etmek için kullanılır.
 * ValueRange range(TemporalField field)	Geçerli değerler aralığını almak için kullanılır
 */
public class App {
    public static void main(String[] args) {
        //Java ZoneOffset Örneği
         ZoneOffset zone = ZoneOffset.UTC;  
    Temporal temp = zone.adjustInto(ZonedDateTime.now());  
    System.out.println(temp);
    
    //Java ZoneOffset Örneği: ofHours ()
       zone = ZoneOffset.ofHours(5);  
    System.out.println(zone);  
    
    //Java ZoneOffset Örnek: ofHoursMinutes ()
       zone = ZoneOffset.ofHoursMinutes(5,30);  
    System.out.println(zone);  
    
    //Java ZoneOffset Örnek: isSupported ()
     zone = ZoneOffset.UTC;  
    boolean b1 = zone.isSupported(ChronoField.OFFSET_SECONDS);  
    System.out.println(b1);  
    boolean b2 = zone.isSupported(ChronoField.SECOND_OF_MINUTE);  
    System.out.println(b2);  
    
    
    }
}
