package com.Date.LocalDateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

/*
 * Java LocalDateTime sınıfı, yyyy-AA-dd-HH-mm-ss.zzz biçimindeki varsayılan biçime sahip bir tarih-saatini temsil eden değişmez bir tarih-saat nesnesidir
 * String format(DateTimeFormatter formatter)	Belirtilen biçimlendiriciyi kullanarak bu tarih zamanını biçimlendirmek için kullanılır.
 * int get(TemporalField field)	Belirtilen alanın değerini bu tarih-saatten int olarak almak için kullanılır.
 * LocalDateTime minusDays(long days)	Bu LocalDateTime öğesinin bir kopyasını çıkartılan belirtilen gün sayısıyla döndürmek için kullanılır.
 * static LocalDateTime now()	Geçerli tarih-saatini sistem saatinden varsayılan zaman diliminde elde etmek için kullanılır.
 * static LocalDateTime of(LocalDate date, LocalTime time)	Bir tarih ve saatten LocalDateTime örneğini elde etmek için kullanılır.
 * LocalDateTime plusDays(long days)	Bu LocalDateTime öğesinin bir kopyasını belirtilen gün sayısıyla döndürmek için kullanılır.
 * boolean equals(Object obj)	Bu tarih-saatin başka bir tarih-zamana eşit olup olmadığını kontrol etmek için kullanılır.
 */
public class App {
     public static void main(String[] args) {
         //Java LocalDateTime Örneği
        LocalDateTime now = LocalDateTime.now();  
        System.out.println("Before Formatting: " + now);  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        String formatDateTime = now.format(format);  
        System.out.println("After Formatting: " + formatDateTime);  
        
    //Java LocalDateTime Örnek: now ()
    LocalDateTime datetime1 = LocalDateTime.now();  
     format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
     formatDateTime = datetime1.format(format);   
    System.out.println(formatDateTime);  

//Java LocalDateTime Örnek: get ()
    LocalDateTime a = LocalDateTime.of(2017, 2, 13, 15, 56);    
    System.out.println(a.get(ChronoField.DAY_OF_WEEK));  
    System.out.println(a.get(ChronoField.DAY_OF_YEAR));  
    System.out.println(a.get(ChronoField.DAY_OF_MONTH));  
    System.out.println(a.get(ChronoField.HOUR_OF_DAY));  
    System.out.println(a.get(ChronoField.MINUTE_OF_DAY));   
 
 //Java LocalDateTime Örnek: minusDays ()
  datetime1 = LocalDateTime.of(2017, 1, 14, 10, 34);  
  LocalDateTime datetime2 = datetime1.minusDays(100);  
  System.out.println("Before Formatting: " + datetime2);  
   format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");  
   formatDateTime = datetime2.format(format);   
  System.out.println("After Formatting: " + formatDateTime );  
 
 //Java LocalDateTime Örnek: plusDays ()
    datetime1 = LocalDateTime.of(2017, 1, 14, 10, 34);  
   datetime2 = datetime1.plusDays(120);  
  System.out.println("Before Formatting: " + datetime2);  
   format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");  
   formatDateTime = datetime2.format(format);   
  System.out.println("After Formatting: " + formatDateTime );  
}

}
