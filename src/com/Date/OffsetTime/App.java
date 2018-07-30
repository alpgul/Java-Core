package com.Date.OffsetTime;

import java.time.OffsetTime;
import java.time.temporal.ChronoField;

/*
 * Java OffsetTime sınıfı, genellikle saat-dakika saniye ofseti olarak görüntülenen bir zamanı temsil eden, değişmez bir tarih-saat nesnesidir
 * Methodlar:
 * String format(DateTimeFormatter formatter)	Bu süreyi belirtilen biçimlendiriciyi kullanarak biçimlendirmek için kullanılır.
 * int get(TemporalField field)	Belirtilen alanın değerini bu zamandan int olarak almak için kullanılır.
 * int getHour()	Günün saatini almak için kullanılır.
 * int getMinute()	Dakika-saat alanını almak için kullanılır.
 * int getSecond()	İkinci dakika alanını elde etmek için kullanılır.
 * static OffsetTime now()	Geçerli saat dilimini sistem saatinden varsayılan saat diliminde elde etmek için kullanılır.
 * static OffsetTime of(LocalTime time, ZoneOffset offset)	Yerel bir süreden OfsetTime örneğini ve bir ofset elde etmek için kullanılır.
 * ValueRange range(TemporalField field)	Belirtilen alan için geçerli değerler aralığını almak için kullanılır.
 * VLocalTime toLocalTime()	Bu tarihin LocalTime bölümünü almak için kullanılır.
 */
public class App {
    public static void main(String[] args) {
        //Java OffsetTime sınıfı Örnek
        OffsetTime offset = OffsetTime.now();  
    int h = offset.get(ChronoField.HOUR_OF_DAY);  
    System.out.println(h);  
    int m = offset.get(ChronoField.MINUTE_OF_DAY);  
    System.out.println(m);  
    int s = offset.get(ChronoField.SECOND_OF_DAY);  
    System.out.println(s);
    
    //Java OffsetTime sınıfı Örnek: getHour ()
      offset = OffsetTime.now();  
     h = offset.getHour();  
    System.out.println(h+ " hour");  
    
    //Java OffsetTime sınıfı Örnek: getMinute ()
       offset = OffsetTime.now();  
     m = offset.getMinute();  
    System.out.println(m+ " minute");
    
//Java OffsetTime sınıfı Örnek: getSecond ()
      offset = OffsetTime.now();  
     s = offset.getSecond();  
    System.out.println(s+ " second");  
    }
}
