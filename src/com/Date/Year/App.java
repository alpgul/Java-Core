package com.Date.Year;

import java.time.LocalDate;
import java.time.Year;

/*
 * Java Yıl sınıfı, bir yılı temsil eden değişmez bir tarih-saat nesnesidir
 * Metodlar:
 * LocalDate atDay(int dayOfYear)	LocalDate oluşturmak için bu yıl bir yıl ile birleştirmek için kullanılır.
 * String format(DateTimeFormatter formatter)	Belirtilen biçimlendiriciyi kullanarak bu yıl biçimlendirmek için kullanılır.
 * int get(TemporalField field)	Belirtilen alanın değerini bu yıldan bir int olarak almak için kullanılır.
 * boolean isAfter(Year other)	Bu yılın belirtilen yıldan sonra olup olmadığını kontrol etmek için kullanılır.
 * boolean isBefore(Year other)	Bu yılın belirtilen yıldan önce olup olmadığını kontrol etmek için kullanılır.
 * boolean isLeap()	ISO proleptik takvim sistemi kurallarına göre, yılın bir yıl olup olmadığını kontrol etmek için kullanılır.
 * int length()	Bu yılın uzunluğunu gün olarak almak için kullanılır.
 * static Year now()	Geçerli yılı, sistem saatinden varsayılan saat diliminde elde etmek için kullanılır.
 */
public class App {
    public static void main(String[] args) {
        //Java Yılı Örneği: now ()
        Year y = Year.now();  
    System.out.println(y);  
        //Java Yılı Örneği: atDay ()
         y = Year.of(2017);  
    LocalDate l = y.atDay(123);  
    System.out.println(l);  
        //Java Yılı Örneği: length ()
        Year year = Year.of(2017);  
    System.out.println(year.length());  
        //Java Yılı Örneği: isLeap ()
          year = Year.of(2016);  
    System.out.println(year.isLeap());  
    }
}
