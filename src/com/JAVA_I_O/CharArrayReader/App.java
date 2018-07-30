package com.JAVA_I_O.CharArrayReader;

import java.io.*;

/*
 * CharArrayReader iki kelimeden oluşur: CharArray ve Reader. 
 * CharArrayReader sınıfı, karakter dizisini bir okuyucu (akış) olarak okumak için kullanılır . 
 * Reader sınıfını devralır .
 * 
 * Metodlar:
 * int read()	Tek bir karakteri okumak için kullanılır
 * int read(char[] b, int off, int len)	Karakterleri bir dizinin bölümüne okumak için kullanılır.
 * boolean ready()	Akışın okunmaya hazır olup olmadığını söylemek için kullanılır.
 * boolean markSupported()	Akışın mark () işlemini destekleyip desteklemediğini söylemek için kullanılır.
 * long skip(long n)	Giriş akışındaki karakteri atlamak için kullanılır.
 * void mark(int readAheadLimit)	Akımdaki mevcut pozisyonu işaretlemek için kullanılır.
 * void reset()	Akışı en son işarete sıfırlamak için kullanılır.
 * void close()	Akışı kapatmak için kullanılır.
 */
public class App {
      public static void main(String[] ag) throws Exception {  
    char[] ary = { 'j', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't' };  
    CharArrayReader reader = new CharArrayReader(ary);  
    int k = 0;  
    // Read until the end of a file  
    while ((k = reader.read()) != -1) {  
      char ch = (char) k;  
      System.out.print(ch + " : ");  
      System.out.println(k);  
    }  
  } 
}
