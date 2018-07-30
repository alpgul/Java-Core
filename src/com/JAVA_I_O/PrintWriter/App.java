package com.JAVA_I_O.PrintWriter;

import java.io.*;

/*
 * Java PrintWriter sınıfı, Writer sınıfının uygulanmasıdır . 
 * Nesnelerin biçimlendirilmiş temsilini metin çıktı akışına yazdırmak için kullanılır .
 * PrintWriter bir karakter akışıdır (Yazarın alt sınıfı)
 * Gerekirse programcı, istisna durumlarını checkError () yöntemiyle kontrol edebilir .
 * PrintWriter ile, tipik olarak kodlamayı belirleyebilir ve böylece platform bağımlılıklarını önleyebiliriz
 * PrintWriter yazıcı = yeni PrintWriter (yeni OutputStreamWriter (çıktı, "UTF-8"));
 * PrintWriter yapıcısı ile, UTF-8 kodlaması kullanılır; platform bağımlı değil. 
 * Bu, programcının kodlama stilini kontrol edebildiği PrintWriter ile avantajdır.
 * 
 * Metodları:
 * void println(boolean x)	boolean değerini yazdırmak için kullanılır.
 * void println(char[] x)	Bir dizi karakter yazdırmak için kullanılır .
 * void println(int x)	Bir tamsayı yazdırmak için kullanılır.
 * PrintWriter append(char c)	Belirtilen karakteri yazara eklemek için kullanılır.
 * PrintWriter append(CharSequence ch)	Belirtilen karakter sırasını yazara eklemek için kullanılır.
 * PrintWriter append(CharSequence ch, int start, int end)	Belirtilen karakterin bir alt dizinini yazara eklemek için kullanılır.
 * boolean checkError()	Akışı temizler ve hata durumunu kontrol etmek için kullanılır.
 * protected void setError()	Bir hata oluştuğunu belirtmek için kullanılır.
 * protected void clearError()	Bir akımın hata durumunu temizlemek için kullanılır.
 * PrintWriter format(String format, Object... args)	Belirtilen argümanlar ve format dizgisini kullanarak yazara biçimlendirilmiş bir dize yazmak için kullanılır .
 * void print(Object obj)	Bir nesneyi yazdırmak için kullanılır.
 * void flush()	Akışı temizlemek için kullanılır.
 * void close()	Akışı kapatmak için kullanılır.
 */
public class App {
      public static void main(String[] args) throws Exception {  
             //Data to write on Console using PrintWriter  
      PrintWriter writer = new PrintWriter(System.out);    
      writer.write("Javatpoint provides tutorials of all technology.");        
 writer.flush();  
      writer.close();  
//Data to write in File using PrintWriter       
      PrintWriter writer1 =null;      
         writer1 = new PrintWriter(new File("D:\\testout.txt"));  
         writer1.write("Like Java, Spring, Hibernate, Android, PHP etc.");                                                   
                         writer1.flush();  
         writer1.close();  
    }  
}
