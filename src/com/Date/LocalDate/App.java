package com.Date.LocalDate;

import java.time.*;

/*
 * Java LocalDate sınıfı, varsayılan değeri yyyy-MM-dd olan Tarih'i temsil eden değişmez bir sınıftır
 * public final class LocalDate extends Object   
 * implements Temporal, TemporalAdjuster, ChronoLocalDate, Serializable  
 * 
 * Metodlar:
 * LocalDateTime atTime(int hour, int minute)	Bu , bir LocalDateTime oluşturmak için  zamanla tarihi birleştirmek için kullanılır.
 * int compareTo(ChronoLocalDate other)	Bu tarihi başka bir tarihe göre karşılaştırmak için kullanılır.
 * boolean equals(Object obj)	Bu tarihin başka bir tarihe eşit olup olmadığını kontrol etmek için kullanılır.
 * String format(DateTimeFormatter formatter)	Bu tarihi belirtilen biçimlendiriciyi kullanarak biçimlendirmek için kullanılır.
 * int get(TemporalField field)	Belirtilen alanın değerini bu tarihten itibaren int olarak almak için kullanılır.
 * boolean isLeapYear()	ISO proleptik takvim sistemi kurallarına göre, yılın bir yıl olup olmadığını kontrol etmek için kullanılır.
 * LocalDate minusDays(long daysToSubtract)	Bu LocalDate öğesinin bir kopyasının  belirtilen gün sayısı kadar çıkartılarak döndürülmesi için kullanılır.
 * LocalDate minusMonths(long monthsToSubtract)	Bu LocalDate'in bir kopyasının  belirtilen ay kadar eksilterek birlikte döndürülmesi için kullanılır.
 * static LocalDate now()	Geçerli saati sistem saatinden varsayılan saat diliminde elde etmek için kullanılır.
 * LocalDate plusDays(long daysToAdd)	Bu LocalDate öğesinin bir kopyasını, belirtilen belirli gün sayısı ekleyerek döndürmek için kullanılır.
 * LocalDate	plusMonths(long monthsToAdd)	Bu LocalDate öğesinin bir kopyasını, belirtilen eklenmiş ay sayısıyla döndürmek için kullanılır.
 */
public class App {
    public static void main(String[] args) {
        //Java LocalDate Örneği
          LocalDate date = LocalDate.now();  
    LocalDate yesterday = date.minusDays(1);  
    LocalDate tomorrow = yesterday.plusDays(2);  
    System.out.println("Today date: "+date);  
    System.out.println("Yesterday date: "+yesterday);  
    System.out.println("Tommorow date: "+tomorrow);  
    
    //Java LocalDate Örnek: isLeapYear ()
    LocalDate date1 = LocalDate.of(2017, 1, 13);  
    System.out.println(date1.isLeapYear());  
    LocalDate date2 = LocalDate.of(2016, 9, 23);  
    System.out.println(date2.isLeapYear());  
    
    //Java LocalDate Örnek: atTime ()
        LocalDate date3 = LocalDate.of(2017, 1, 13);  
    LocalDateTime datetime = date3.atTime(1,50,9);      
    System.out.println(datetime);  
    
    }
}
