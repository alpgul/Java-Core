package com.JAVA_I_O.ByteArrayInputStream;

import java.io.ByteArrayInputStream;

/*
 * Kurucular:
 * ByteArrayInputStream(byte[] ary)	ary byte dizisini kullanarak yeni byte veri giriş akışı oluşturur.
 * ByteArrayInputStream(byte[] ary, int offset, int len) ary dizisinin offset ile belirtilen yerden başlayarak  len miktarında byte giriş akısı olusturur.
 * 
 * Methodlar:
 * int available()	okunabilecek kalan bayt sayısını döndürmek için kullanılır.
 * int read()	Giriş akışından sonraki veri baytını okumak için kullanılır.
 * int read(byte[] ary, int off, int len)	len miktar byte array byte dizisinden okur
 * boolean markSupported()	mark ve reset metodunun giriş akışını test etmek için kullanılır.
 * long skip(long x)	Giriş akışından girişin x baytını atlamak için kullanılır.
 * void mark(int readAheadLimit)	Akımdaki mevcut  pozisyonu  readAheadLimit limti boyunca işaretlemek için kullanılır.
 * void reset()	işaretlenen kısıma geri donmek için kullanılır.
 * void close()	ByteArrayInputStream öğesini kapatmak için kullanılır.
 */
public class App {
    public static void main(String[] args) {
        //Example of Java ByteArrayInputStream
         byte[] buf = { 35, 36, 37, 38 };  
    // Create the new byte array input stream  
    ByteArrayInputStream byt = new ByteArrayInputStream(buf);  
    int k = 0;  
    while ((k = byt.read()) != -1) {  
      //Conversion of a byte into character  
      char ch = (char) k;  
      System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);  
    }  
    }
}
