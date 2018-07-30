package com.Date.util_calendar;

import java.util.Calendar;

/*
 * Java Takvim sınıfı, belirli bir andaki tarih ile MONTH, YEAR, HOUR vb. Gibi bir dizi takvim alanı arasında tarih dönüştürme için yöntemler sağlayan soyut bir sınıftır. 
 * 
 * Metodlar:
 * abstract void add(int field, int amount)	Belirtilen takvim süresine, takvim kurallarına bağlı olarak belirtilen süreyi eklemek veya çıkarmak için kullanılır.
 * int get(int field)	Verilen takvim alanının değerini döndürmek için kullanılır.
 * static Calendar getInstance()	Varsayılan saat dilimini ve yerel ayarı kullanarak bir takvim almak için kullanılır.
 * abstract int getMaximum(int field)	Bu Takvim örneğinin verilen takvim alanı için maksimum değeri döndürmek için kullanılır.
 * abstract int getMinimum(int field)	Bu Takvim örneğinin verilen takvim alanı için minimum değeri döndürmek için kullanılır.
 * void set(int field, int value)	Verilen takvim alanını verilen değere ayarlamak için kullanılır.
 * void setTime(Date date)	Bu Takvimin saatini verilen Tarihle ayarlamak için kullanılır.
 * Date getTime()	Bu Takvimin saat değerini temsil eden bir Tarih nesnesini döndürmek için kullanılır.
 */
public class App {
    public static void main(String[] args) {
        //Java Takvim Sınıfı Örneği
           Calendar calendar = Calendar.getInstance();  
   System.out.println("The current date is : " + calendar.getTime());  
   calendar.add(Calendar.DATE, -15);  
   System.out.println("15 days ago: " + calendar.getTime());  
   calendar.add(Calendar.MONTH, 4);  
   System.out.println("4 months later: " + calendar.getTime());  
   calendar.add(Calendar.YEAR, 2);  
   System.out.println("2 years later: " + calendar.getTime()); 
        //Java Takvim Sınıfı Örnek: get ()
         calendar = Calendar.getInstance();  
   System.out.println("At present Calendar's Year: " + calendar.get(Calendar.YEAR));  
   System.out.println("At present Calendar's Day: " + calendar.get(Calendar.DATE));  
        //Java Takvim Sınıfı Örnek: getInstance ()
            calendar = Calendar.getInstance();  
   System.out.print("At present Date And Time Is: " + calendar.getTime());  
        //Java Takvim Sınıfı Örnek: getMaximum ()
            calendar = Calendar.getInstance();  
   int maximum = calendar.getMaximum(Calendar.DAY_OF_WEEK);  
   System.out.println("Maximum number of days in week: " + maximum);  
   maximum = calendar.getMaximum(Calendar.WEEK_OF_YEAR);  
   System.out.println("Maximum number of weeks in year: " + maximum);  
        //Java Takvim Sınıfı Örnek: getMinimum ()
           Calendar cal = Calendar.getInstance();  
    maximum = cal.getMinimum(Calendar.DAY_OF_WEEK);  
   System.out.println("Minimum number of days in week: " + maximum);  
   maximum = cal.getMinimum(Calendar.WEEK_OF_YEAR);  
   System.out.println("Minimum number of weeks in year: " + maximum);  
    }
}
