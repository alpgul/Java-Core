package com.Date.OffsetDateTime;

import java.time.OffsetDateTime;

/*
 * Java OffsetDateTime sınıfı, bir ofset ile bir tarih-zamanın değişmez bir temsilidir
 * 
 * Methodlar:
 * int get(TemporalField field)	Belirtilen alanın değerini bu tarih-saatten int olarak almak için kullanılır.
 * int getDayOfMonth()	Ayın gününü almak için kullanılır.
iint getDayOfYear()	Yıl-yıl alanını elde etmek için kullanılır.
DayOfWeek getDayOfWeek()	Bir günlük DayOfWeek olan haftanın günü alanını almak için kullanılır.
OffsetDateTime minusDays(long days)	Bu OffsetDateTime öğesinin bir kopyasını çıkartılan belirtilen gün sayısıyla döndürmek için kullanılır.
static OffsetDateTime	now()	Geçerli tarih-saatini sistem saatinden varsayılan zaman diliminde elde etmek için kullanılır.
OffsetDateTime plusDays(long days)	Bu OffsetDateTime öğesinin bir kopyasını belirtilen gün sayısıyla döndürmek için kullanılır.
LocalDate toLocalDate()	Bu tarihin LocalDate bölümünü almak için kullanılır.
 */
public class App {
    public static void main(String[] args) {
        //Java OffsetDateTime sınıfı Örnek: getDayOfMonth ()
        
        OffsetDateTime offsetDT = OffsetDateTime.now();  
        System.out.println(offsetDT.getDayOfMonth());  
        
        //Java OffsetDateTime sınıfı Örnek: getDayOfYear ()
        
         offsetDT = OffsetDateTime.now();  
        System.out.println(offsetDT.getDayOfYear());  
        
        //Java OffsetDateTime sınıfı Örnek: getDayOfWeek ()
         offsetDT = OffsetDateTime.now();  
        System.out.println(offsetDT.getDayOfWeek());  
        
        //Java OffsetDateTime sınıfı Örnek: toLocalDate ()
         offsetDT = OffsetDateTime.now();  
        System.out.println(offsetDT.toLocalDate()); 
        
        //Java OffsetDateTime sınıfı Örnek: minusDays ()
         OffsetDateTime offset = OffsetDateTime.now();  
    OffsetDateTime value =  offset.minusDays(240);  
    System.out.println(value);
    
//Java OffsetDateTime sınıfı Örnek: plusDays ()
 offset = OffsetDateTime.now();  
     value =  offset.plusDays(240);  
    System.out.println(value);  
    }
}
