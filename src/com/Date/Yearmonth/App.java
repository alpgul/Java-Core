package com.Date.Yearmonth;

import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

/*
 * Java YearMonth sınıfı, bir yıl ve ayın kombinasyonunu temsil eden değişmez bir tarih-saat nesnesidir
 * 
 * Metodlar:
 * Temporal adjustInto(Temporal temporal)	Belirtilen zamansal nesneyi bu yıl ayına ayarlamak için kullanılır.
 * String format(DateTimeFormatter formatter)	Belirtilen biçimlendiriciyi kullanarak bu yıl ayı biçimlendirmek için kullanılır.
 * int get(TemporalField field)	Belirtilen alanın değerini bu yıldan itibaren int olarak almak için kullanılır.
 * boolean isLeapYear()	ISO proleptik takvim sistemi kurallarına göre, yılın bir yıl olup olmadığını kontrol etmek için kullanılır.
 * static YearMonth now()	Geçerli saat diliminde sistem saatinden geçerli yıl ayını elde etmek için kullanılır.
 * static YearMonth of(int year, int month)	Bir yıl ve aydan bir YearMonth örneği almak için kullanılır.
 * YearMonth plus(TemporalAmount amountToAdd)	Bu yılın bir kopyasını çıkardığı belirtilen miktarda arttırarak döndürmek için kullanılır.
 * YearMonth	minus (TemporalAmount amountToSubtract) Bu yılın bir kopyasını çıkardığı belirtilen miktarda azaltarak döndürmek için kullanılır.
 */
public class App {
    public static void main(String[] args) {
//Java YearMonth Örnek: now()        
YearMonth ym = YearMonth.now();  
  System.out.println(ym);  
  
//Java YılMonth Örnek: format ()
     ym = YearMonth.now();  
    String s = ym.format(DateTimeFormatter.ofPattern("MM yyyy"));  
    System.out.println(s);
    
//Java YearMonth Örnek: get ()
 YearMonth y = YearMonth.now();  
    long l1 = y.get(ChronoField.YEAR);  
    System.out.println(l1);  
    long l2 = y.get(ChronoField.MONTH_OF_YEAR);  
    System.out.println(l2);  
    
//Java YearMonth Örnek: plus ()
  YearMonth ym1 = YearMonth.now();  
    YearMonth ym2 = ym1.plus(Period.ofYears(2));  
    System.out.println(ym2);  
    
//Java YearMonth Örnek: minus ()
 ym1 = YearMonth.now();  
     ym2 = ym1.minus(Period.ofYears(2));  
    System.out.println(ym2);  
    }
}
