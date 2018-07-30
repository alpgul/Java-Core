package com.Date.Instant;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

/*
 * Java Instant sınıfı, zaman çizgisindeki belirli anı temsil etmek için kullanılır.
 * 
 * Metodlar:
 * Temporal adjustInto(Temporal temporal).	Belirtilen temporal nesneyi bu anı ayarlamak için kullanılır.
 * int get(TemporalField field)	Belirtilen alanın değerini bu andan int olarak almak için kullanılır.
 * boolean isSupported(TemporalField field)	Belirtilen alanın desteklenip desteklenmediğini kontrol etmek için kullanılır.
 * Instant minus(TemporalAmount amountToSubtract)	Bu anın bir kopyasını  belirtilen miktarla eksilterek döndürmek için kullanılır.
 * static Instant now()	Geçerli anı sistem saatinden almak için kullanılır.
 * static Instant parse(CharSequence text)	2007-12-03T10: 15: 30.00Z gibi bir metin dizesinden Anında Anlık Görüntü elde etmek için kullanılır.
 * Instant plus(TemporalAmount amountToAdd)	Bu anın bir kopyasını eklenen miktarla birlikte döndürmek için kullanılır.
 * Instant with(TemporalAdjuster adjuster)	Bu anın ayarlanmış bir kopyasını döndürmek için kullanılır.
 */
public class App {
    public static void main(String[] args) {
        //Java Instant Örnek: parse ()
         Instant inst = Instant.parse("2017-02-03T10:37:30.00Z");  
    System.out.println(inst);  
    
        //Java Instant Örnek: now ()
            Instant instant = Instant.now();  
    System.out.println(instant);    
    
        //Java Instant Örnek: minus ()
           instant = Instant.parse("2017-02-03T11:25:30.00Z");  
    instant = instant.minus(Duration.ofDays(125));  
    System.out.println(instant);  
    
        //Java Instant Örnek: plus ()
         Instant inst1 = Instant.parse("2017-02-03T11:25:30.00Z");  
    Instant inst2 = inst1.plus(Duration.ofDays(125));  
    System.out.println(inst2);  
    
        //Java Instant Örnek: isSupported ()
         inst = Instant.parse("2017-02-03T11:35:30.00Z");  
    System.out.println(inst.isSupported(ChronoUnit.DAYS));  
    System.out.println(inst.isSupported(ChronoUnit.YEARS));   
    }
}
