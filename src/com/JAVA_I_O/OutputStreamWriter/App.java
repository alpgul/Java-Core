package com.JAVA_I_O.OutputStreamWriter;

import java.io.*;

/*
 * OutputStreamWriter, karakter akışını bayt akışına dönüştürmek için kullanılan bir sınıftır , 
 * karakterler belirtilen bir karakter kümesini kullanarak bayt olarak kodlanır.
 * 
 * Kurucu:
 * OutputStreamWriter(OutputStream out)	Varsayılan karakter kodlamasını kullanan bir OutputStreamWriter oluşturur.
 * OutputStreamWriter(OutputStream out, Charset cs)	Verilen karakter kümesini kullanan bir OutputStreamWriter oluşturur.
 * OutputStreamWriter(OutputStream out, CharsetEncoder enc)	Verilen karakter kümesi kodlayıcısını kullanan bir OutputStreamWriter oluşturur.
 * OutputStreamWriter(OutputStream out, String charsetName)	Adlandırılmış karakter kümesini kullanan bir OutputStreamWriter oluşturur.
 * 
 * Metodlar:
 * void	close()	İlk önce akan akımı kapatır.
 * void	flush()	Akışı temizler.
 * String	getEncoding()	Bu akış tarafından kullanılan karakter kodlamasının adını döndürür.
 * void	write(char[] cbuf, int off, int len)	Bir dizi karakterin bir bölümünü yazar .
 * void	write(int c)	Tek bir karakter yazıyor.
 * void	write(String str, int off, int len)	Bir dizenin bir bölümünü yazar .
 */
public class App {
     public static void main(String[] args) {  
  
        try {  
            OutputStream outputStream = new FileOutputStream("output.txt");  
            Writer outputStreamWriter = new OutputStreamWriter(outputStream);  
  
            outputStreamWriter.write("Hello World");  
  
            outputStreamWriter.close();  
        } catch (Exception e) {  
            e.getMessage();  
        }  
    }  
}
