package com.Date.util_Date;
/*
 * Java.util.Date sınıfı, java'da tarih ve saati temsil eder. Java'da tarih ve saat ile başa çıkmak için kurucular ve yöntemler sağlar.
 * Java.util.Date sınıfı, Serializable, Cloneable ve Karşılaştırılabilir <Date> arabirimini uygular. Java.sql.Date, java.sql.Time ve java.sql.Timestamp arabirimleri tarafından devralınır.
 * Calendar sınıfından sonra, çoğu kurucu ve java.util.Date sınıfının yöntemleri kullanımdan kaldırılmıştır.
 * 
 * Kurucular:
 * Date ()	Geçerli tarih ve saati temsil eden bir tarih nesnesi oluşturur.
 * Date (long milisaniye)	1 Ocak 1970, 00:00:00 GMT'den bu yana verilen milisaniyeler için bir tarih nesnesi oluşturur.
 * 
 * Metodlar:
 * 1)	boolean after(Date date)	Geçerli tarihin belirtilen tarihten sonra olup olmadığını sınar.
 * 2)	boolean before(Date date)	Geçerli tarihin belirtilen tarihten önce olup olmadığını sınar.
 * 3)	Object clone()	geçerli tarihin klon nesnesini döndürür.
 * 4)	int compareTo(Date date)	Mevcut tarihi belirtilen tarihle karşılaştırır.
 * 5)	boolean equals(Date date)	Mevcut tarihi, eşitlik için verilen tarihle karşılaştırır.
 * 6)	static Date from(Instant instant)	Anlık Tarih'ten bir Date nesnesi örneği döndürür.
 * 7)	long getTime()	bu tarih nesnesi tarafından temsil edilen zamanı döndürür.
 * 8)	int hashCode()	bu tarih nesnesi için karma kod değerini döndürür.
 * 9)	void setTime(long time)	Geçerli tarih ve saati belirli bir zamana göre değiştirir.
 * 10)	Instant toInstant()	Geçerli tarihi Anlık nesneye dönüştürür.
 * 11)	String toString()	bu tarihi Anlık nesneye dönüştürür.
 */
public class App {
    public static void main(String[] args) {
        //java.util.Date Örneği 1
        java.util.Date date=new java.util.Date();  
System.out.println(date);  

///java.util.Date Örneği 2
long millis=System.currentTimeMillis();  
 date=new java.util.Date(millis);  
System.out.println(date);  
    }
}
