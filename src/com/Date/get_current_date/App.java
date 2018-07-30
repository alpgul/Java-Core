package com.Date.get_current_date;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*
 * Java'da Güncel Tarih ve Saati elde etme:
 * java.time.format.DateTimeFormatter sınıfı
 * java.text.SimpleDateFormat sınıfı
 * java.time.LocalDate sınıfı
 * java.time.LocalTime sınıfı
 * java.time.LocalDateTime sınıfı
 * java.time.Clock sınıfı
 * java.util.Date sınıfı
 * java.sql.Date sınıfı
 * java.util.Calendar sınıfı
 * 
 * Not: 
 * Klasik Tarih API'sinde geçerli tarih ve saati almak için Takvim sınıfını kullanmanız önerilir.
 *  Java 8'den beri LocalDate, LocalTime veya LocalDateTime sınıflarını kullanabilirsiniz.
 */
public class App {
    public static void main(String[] args) {
        //Geçerli Tarih ve Saati Al: java.time.format.DateTimeFormatter jdk 1.8
           DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();  
   System.out.println(dtf.format(now));  
   
   //Geçerli Tarih ve Saati Al: java.text.SimpleDateFormat
       SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date();  
    System.out.println(formatter.format(date)); 
    
    //Geçerli Tarihi Alın: java.time.LocalDate
    System.out.println(java.time.LocalDate.now());  
    
    //Geçerli Zamanı Alın: java.time.LocalTime
    System.out.println(java.time.LocalTime.now());  
    
    //Geçerli Tarih ve Saati Al: java.time.LocalDateTime
    System.out.println(java.time.LocalDateTime.now());  
    
    //System.out.println(java.time.Clock.systemUTC().instant());  
    System.out.println(java.time.Clock.systemUTC().instant());  
    
    //Geçerli Tarih ve Saati Alın: java.util.Date 1
     date=new java.util.Date();  
System.out.println(date);  

//Geçerli Tarih ve Saati Alın: java.util.Date 2
long millis=System.currentTimeMillis();  
 date=new java.util.Date(millis);  
System.out.println(date);  

//Geçerli Tarih Alın: java.sql.Date
 millis=System.currentTimeMillis();  
date=new java.sql.Date(millis);  
System.out.println(date);  

//Geçerli Tarih ve Saati Alın: java.util.Calendar
 date=java.util.Calendar.getInstance().getTime();  
System.out.println(date);  
    }
}
