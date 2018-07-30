package com.JAVA_I_O.StringReader;

import java.io.*;

/*
 * Java StringReader sınıf bir karakterdir akışı ileBir giriş dizesi alır 
 * Onu karakter akışına değiştirir. Reader sınıfını devralır 
 * 
 * Kurucular:
 * int read()	Tek bir karakteri okumak için kullanılır.
 * int read(char[] cbuf, int off, int len)	Bir karakterin bir dizinin bir kısmına okunması için kullanılır .
 * boolean ready()	Akışın okunmaya hazır olup olmadığını söylemek için kullanılır.
 * boolean markSupported()	Akış desteği işaretinin () çalışıp çalışmadığını belirtmek için kullanılır.
 * long skip(long ns)	Bir akışta belirtilen karakter sayısını atlamak için kullanılır
 * void mark(int readAheadLimit)	Mevcut durumu bir akışta işaretlemek için kullanılır.
 * void reset()	Akışı sıfırlamak için kullanılır.
 * void close()	Akışı kapatmak için kullanılır.
 */
public class App {
     public static void main(String[] args) throws Exception {  
        String srg = "Hello Java!! \nWelcome to Javatpoint.";  
        StringReader reader = new StringReader(srg);  
        int k=0;  
            while((k=reader.read())!=-1){  
                System.out.print((char)k);  
            }  
        } 
}
