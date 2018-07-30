package com.Date.SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Java.text.SimpleDateFormat sınıfı, java'da tarih ve saati biçimlendirmek ve ayrıştırmak için yöntemler sağlar. SimpleDateFormat, java.text.DateFormat sınıfını devralan biçimlendirme ve ayrıştırma tarihi için somut bir sınıftır.
 * 
 */
public class App {
    public static void main(String[] args) {
        //Java SimpleDateFormat Örnek: Dize Tarih
         Date date = new Date();  
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
    String strDate= formatter.format(date);  
    System.out.println(strDate);  
    
        //Java SimpleDateFormat Örnek: Dize Tarih 2
           date = new Date();  
     formatter = new SimpleDateFormat("MM/dd/yyyy");  
     strDate = formatter.format(date);  
    System.out.println("Date Format with MM/dd/yyyy : "+strDate);  
  
    formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  
    strDate = formatter.format(date);  
    System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+strDate);  
  
    formatter = new SimpleDateFormat("dd MMMM yyyy");  
    strDate = formatter.format(date);  
    System.out.println("Date Format with dd MMMM yyyy : "+strDate);  
  
    formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");  
    strDate = formatter.format(date);  
    System.out.println("Date Format with dd MMMM yyyy zzzz : "+strDate);  
  
    formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");  
    strDate = formatter.format(date);  
    System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : "+strDate); 
    
        //Java SimpleDateFormat Örnek: Tarihe Dize
          formatter = new SimpleDateFormat("dd/MM/yyyy");  
    try {  
         date = formatter.parse("31/03/2015");  
        System.out.println("Date is: "+date);  
    } catch (ParseException e) {e.printStackTrace();}  
    }
}
