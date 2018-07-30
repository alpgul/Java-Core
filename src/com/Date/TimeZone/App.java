package com.Date.TimeZone;

import java.util.Calendar;
import java.util.TimeZone;

/*
 * Java TimeZone sınıfı bir saat dilimi ofsetini temsil eder ve ayrıca gün ışığından yararlanma oranlarını belirler.
 * 
 * Methodlar:
 * static String[] getAvailableIDs()	Desteklenen tüm kullanılabilir kimlikleri almak için kullanılır.
 * static TimeZone getDefault()	Bu ana bilgisayar için varsayılan TimeZone'u almak için kullanılır.
 * String getDisplayName()	Varsayılan yerel ayarda kullanıcıya sunulmak için uygun bu saat diliminin bir adını döndürmek için kullanılır.
 * String getID()	Bu saat diliminin kimliğini almak için kullanılır
 * int getOffset(long date)	Bu saat diliminin uzaklığını belirtilen tarihte UTC'den döndürmek için kullanılır.
 * void setID(String ID)	Saat dilimi kimliğini ayarlamak için kullanılır
 */
public class App {
    public static void main(String[] args) {
        //Java TimeZone sınıfı Örnek: getAvailableIDs ()
          String[] id = TimeZone.getAvailableIDs();        
   System.out.println("In TimeZone class available Ids are: ");  
   for (int i=0; i<id.length; i++){  
   System.out.println(id[i]);  
   }
   //Java TimeZone sınıfı Örnek: getOffset ()
      TimeZone zone = TimeZone.getTimeZone("Asia/Kolkata");   
   System.out.println("The Offset value of TimeZone: " +   
   zone.getOffset(Calendar.ZONE_OFFSET));  
   //Java TimeZone sınıfı Örnek: getID ()
     TimeZone timezone = TimeZone.getTimeZone("Asia/Kolkata");       
   System.out.println("Value of ID is: " + timezone.getID());  
   //Java TimeZone sınıfı Örnek: getDisplayName ()
    zone = TimeZone.getDefault();  
   String name = zone.getDisplayName();         
   System.out.println("Display name for default time zone: "+ name);  
    }
}
