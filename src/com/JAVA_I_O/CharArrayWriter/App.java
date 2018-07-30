package com.JAVA_I_O.CharArrayWriter;

import java.io.*;

/*
 * CharArrayWriter sınıfı, birden çok dosyaya ortak veri yazmak için kullanılabilir. 
 * Bu sınıf Writer sınıfını devralır . Bu akışta veri yazıldığı zaman arabelleği otomatik olarak büyür.
 * Bu nesnede close () yöntemini çağırmanın bir etkisi yoktur.
 * 
 * int size()	Tamponun mevcut boyutunu döndürmek için kullanılır.
 * char[] toCharArray()	Bir giriş verisinin kopyasını döndürmek için kullanılır.
 * String toString()	Bir giriş verisini bir Stringe dönüştürmek için kullanılır .
 * CharArrayWriter append(char c)	Belirtilen karakteri yazara eklemek için kullanılır.
 * CharArrayWriter append(CharSequence csq)	Belirtilen karakter sırasını yazara eklemek için kullanılır.
 * CharArrayWriter append(CharSequence csq, int start, int end)	Belirtilen karakterin alt dizinini yazara eklemek için kullanılır.
 * void write(int c)	Tampona bir karakter yazmak için kullanılır.
 * void write(char[] c, int off, int len)	Tampona bir karakter alt dizisi yazmak için kullanılır.
 * void write(String str, int off, int len)	Tamponun bir kısmını string yazmak için kullanılır.
 * void writeTo(Writer out)	Tampon içeriğini farklı karakter akışına yazmak için kullanılır.
 * void flush()	Akışı temizlemek için kullanılır.
 * void reset()	Tamponu sıfırlamak için kullanılır.
 * void close()	Akışı kapatmak için kullanılır.
 */
public class App {
    public static void main(String args[])throws Exception{    
          CharArrayWriter out=new CharArrayWriter();    
          out.write("Welcome to javaTpoint");    
          FileWriter f1=new FileWriter("D:\\a.txt");    
          FileWriter f2=new FileWriter("D:\\b.txt");    
          FileWriter f3=new FileWriter("D:\\c.txt");    
          FileWriter f4=new FileWriter("D:\\d.txt");    
          out.writeTo(f1);    
          out.writeTo(f2);    
          out.writeTo(f3);    
          out.writeTo(f4);    
          f1.close();    
          f2.close();    
          f3.close();    
          f4.close();    
          System.out.println("Success...");    
         }    
}
