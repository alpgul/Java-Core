package com.Date.sql_Date;

import java.sql.Date;

/*
 * Java.sql.Date sınıfı, yalnızca java'da tarihi temsil eder. Java.util.Date sınıfını devralır.
 * Java.sql.Date örneği, veritabanında depolanabileceği tarihi temsil ettiğinden, JDBC'de yaygın olarak kullanılmaktadır.
 * Kurucu:Date(long milliseconds)	1 Ocak 1970, 00:00:00 GMT tarihinden itibaren verilen milisaniyeler için bir sql tarih nesnesi oluşturur.
 * 
 * Metodlar:
 * 1)	void setTime(long time)	Geçerli sql tarihini verilen zamana değiştirir.
 * 2)	Instant toInstant()	Geçerli sql tarihini Instant nesnesine dönüştürür.
 * 3)	LocalDate toLocalDate()	Geçerli sql tarihini LocalDate nesnesine dönüştürür.
 * 4)	String toString()	bu sql date nesnesini bir dizeye dönüştürür.
 * 5)	static Date valueOf(LocalDate date)	Verilen LocalDate için sql tarih nesnesini döndürür.
 * 6)	static Date valueOf(String date)	Verilen String için sql tarih nesnesini döndürür.
 */
public class App {
    public static void main(String[] args) {
        //java.sql.Date Örnek: güncel tarihi al
             long millis=System.currentTimeMillis();  
        java.sql.Date date=new java.sql.Date(millis);  
        System.out.println(date);  
        
        //Java.sql.Date Örneğine Java Dizesi
         String str="2015-03-31";  
     date=Date.valueOf(str);//converting string into sql date  
    System.out.println(date);  
    }
}
