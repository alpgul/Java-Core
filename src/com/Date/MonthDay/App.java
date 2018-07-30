package com.Date.MonthDay;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

/*
 * Java MonthDay sınıfı, ayın ve ayın birleşimini temsil eden değişmez bir tarih-saat nesnesidir
 * Methodlar:
 * LocalDate atYear(int year)	Bu ay gününü LocalDate oluşturmak için bir yıl ile birleştirmek için kullanılır.
 * String format(DateTimeFormatter formatter)	Belirtilen biçimlendiriciyi kullanarak bu ayın biçimlendirilmesinde kullanılır.
 * int get(TemporalField field)	Belirtilen alanın değerini bu ay gününden int olarak almak için kullanılır.
 * boolean isValidYear(int year)	Bu ayın yıl için geçerli olup olmadığını kontrol etmek için kullanılır.
 * static MonthDay now()	Geçerli saat dilimini sistem saatinden varsayılan saat diliminde elde etmek için kullanılır.
 * static MonthDay of(int month, int dayOfMonth)	MonthDay örneğini elde etmek için kullanılır.
 * ValueRange range(TemporalField field)	Belirtilen alan için geçerli değerler aralığını almak için kullanılır.
 */
public class App {
    public static void main(String[] args) {
        //Java MonthDay sınıfı Örnek
           MonthDay month = MonthDay.now();  
    LocalDate date = month.atYear(1994);  
    System.out.println(date); 
    
    //Java MonthDay sınıfı Örnek: isValidYear ()
     month = MonthDay.now();  
    boolean b = month.isValidYear(2012);  
    System.out.println(b); 
    
    //Java MonthDay sınıfı Örnek: get ()
      month = MonthDay.now();  
    long n = month.get(ChronoField.MONTH_OF_YEAR);  
    System.out.println(n); 
    
    //Java MonthDay sınıfı Örnek: range ()
      month = MonthDay.now();  
    ValueRange r1 = month.range(ChronoField.MONTH_OF_YEAR);  
    System.out.println(r1);  
    ValueRange r2 = month.range(ChronoField.DAY_OF_MONTH);  
    System.out.println(r2);  
    }
}
