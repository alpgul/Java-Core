package com.Date.date_format;

import java.text.DateFormat;
import java.util.Date;

/*
 * Java'da biçimlendirme tarihi için iki sınıf vardır: DateFormat ve SimpleDateFormat.
 * Java.text.DateFormat sınıfı, java'da dili ve dili farklı şekilde biçimlendirmek ve ayrıştırmak için çeşitli yöntemler sağlar. 
 * DateFormat sınıfı soyut bir sınıftır. 
 * java.text.Format üst sınıfı ve java.text.SimpleDateFormat java.text.DateFormat sınıfının alt sınıfıdır.
 * 
 * Metodlar:
 * 1)	final String format(Date date)	Date nesnesini Stringe dönüştürür.
 * 2)	Date parse(String source)throws ParseException	Stringi Date nesnesine dönüştürür.
 * 3)	static final DateFormat getTimeInstance()	varsayılan yerel ayar için varsayılan biçimlendirme stiliyle zaman biçimlendiricisini döndürür.
 * 4)	static final DateFormat getTimeInstance(int style)	varsayılan yerel ayar için verilen biçimlendirme stiliyle zaman biçimlendiricisini döndürür.
 * 5)	static final DateFormat getTimeInstance(int style, Locale locale)	Verilen yerel ayar için verilen biçimlendirme stiliyle zaman formatlayıcısını döndürür.
 * 6)	static final DateFormat getDateInstance()	varsayılan yerel ayar için varsayılan biçimlendirme stiliyle tarih biçimlendiricisini döndürür.
 * 7)	static final DateFormat getDateInstance(int style)	varsayılan yerel ayar için verilen biçimlendirme stiliyle tarih biçimlendiriciyi döndürür.
 * 8)	static final DateFormat getDateInstance(int style, Locale locale)	Verilen yerel ayar için verilen biçimlendirme stiliyle tarih formatlayıcısını döndürür.
 * 9)	static final DateFormat getDateTimeInstance()	Varsayılan yerel ayar için varsayılan biçimlendirme stiliyle tarih / saat formatını döndürür.
 * 10)	static final DateFormat getDateTimeInstance(int dateStyle,int timeStyle)	tarih / saat formatlayıcısını, varsayılan yerel ayar için belirtilen tarih formatlama stili ve saat formatlama stiliyle döndürür.
 * 11)	static final DateFormat getDateTimeInstance(int dateStyle, int timeStyle, Locale locale)	Verilen tarih için verilen tarih formatlama stili ve saat formatlama stiliyle tarih / saat formatlayıcısını döndürür.
 * 12)	static final DateFormat getInstance()	Tarih ve saat için kısa biçimlendirme stiliyle tarih / saat formatını döndürür.
 * 13)	static Locale[] getAvailableLocales()	kullanılabilir yerel bir dizi döndürür.
 * 14)	Calendar getCalendar()	bu DateFormat örneği için bir Takvim örneği döndürür.
 * 15)	NumberFormat getNumberFormat()	bu DateFormat örneği için NumberFormat örneğini döndürür.
 * 16)	TimeZone getTimeZone()	bu DateFormat örneği için bir TimeZone örneği döndürür.
 */
public class App {
    public static void main(String[] args) throws Exception{
        //Java DateFormat Örnek: Dize Tarih
          Date currentDate = new Date();  
        System.out.println("Current Date: "+currentDate);  
        String dateToStr = DateFormat.getInstance().format(currentDate);  
        System.out.println("Date Format using getInstance(): "+dateToStr);  
        
        //Java DateFormat Örnek: Dize Tarih 2
            currentDate = new Date();  
        System.out.println("Current Date: "+currentDate);  
  
         dateToStr = DateFormat.getInstance().format(currentDate);  
        System.out.println("Date Format using getInstance(): "+dateToStr);  
  
        dateToStr = DateFormat.getDateInstance().format(currentDate);  
        System.out.println("Date Format using getDateInstance(): "+dateToStr);  
  
        dateToStr = DateFormat.getTimeInstance().format(currentDate);  
        System.out.println("Date Format using getTimeInstance(): "+dateToStr);  
  
        dateToStr = DateFormat.getDateTimeInstance().format(currentDate);  
        System.out.println("Date Format using getDateTimeInstance(): "+dateToStr);  
  
        dateToStr = DateFormat.getTimeInstance(DateFormat.SHORT).format(currentDate);  
        System.out.println("Date Format using getTimeInstance(DateFormat.SHORT): "+dateToStr);  
  
        dateToStr = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(currentDate);  
        System.out.println("Date Format using getTimeInstance(DateFormat.MEDIUM): "+dateToStr);  
          
        dateToStr = DateFormat.getTimeInstance(DateFormat.LONG).format(currentDate);  
        System.out.println("Date Format using getTimeInstance(DateFormat.LONG): "+dateToStr);  
          
        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(currentDate);  
        System.out.println("Date Format using getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT): "+dateToStr);  
        
        //Java DateFormat Örnek: Tarihe Dize
                Date d = DateFormat.getDateInstance().parse("31 Mar, 2015");  
        System.out.println("Date is: "+d);  
    }
}
