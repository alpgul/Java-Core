package com.Date.ZoneId;

import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

/* 
 * Java ZoneId sınıfı bir saat dilimi tanımlayıcısını belirtir
 * Metodlar:
 * String getDisplayName(TextStyle style, Locale locale)	Bölgenin metinsel saat dilimi gösterimini elde etmek için kullanılır.
 * abstract String getId()	Benzersiz saat dilimi kimliğini elde etmek için kullanılır.
 * static ZoneId of(String zoneId)	ID'nin geçerli ve kullanıma hazır olmasını sağlayan bir ID'den ZoneId örneğini elde etmek için kullanılır.
 * static ZoneId systemDefault()	Sistem varsayılan zaman dilimini almak için kullanılır.
 * boolean equals(Object obj)	Bu saat dilimi kimliğinin başka bir saat dilimi kimliğine eşit olup olmadığını kontrol etmek için kullanılır.
 */

public class App {
    public static void main(String[] args) {
        //Java ZoneId sınıfı Örnek
           ZoneId zoneid1 = ZoneId.of("Asia/Kolkata");  
    ZoneId zoneid2 = ZoneId.of("Asia/Tokyo");  
    LocalTime id1 = LocalTime.now(zoneid1);  
    LocalTime id2 = LocalTime.now(zoneid2);  
    System.out.println(id1);  
    System.out.println(id2);  
    System.out.println(id1.isBefore(id2));    
    
    //Java ZoneId sınıfı Örnek: systemDefault ()
    ZoneId zone = ZoneId.systemDefault();     
    System.out.println(zone);  
    
    //Java ZoneId sınıfı Örnek: getId ()
        ZoneId z = ZoneId.systemDefault();  
    String s = z.getId();  
    System.out.println(s);  
    //Java ZoneId sınıfı Örnek: getDisplayName ()
        z = ZoneId.systemDefault();  
    System.out.println(z.getDisplayName(TextStyle.FULL, Locale.ROOT));  
        
    }
}
