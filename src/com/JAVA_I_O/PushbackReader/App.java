package com.JAVA_I_O.PushbackReader;

import java.io.*;

/*
 * Java PushbackReader sınıfı bir karakter akışı okuyucusudur.
 *  Bir karakteri akışa geri itmek ve FilterReader sınıfını geçersiz kılmak için kullanılır .
 * 
 * Metodları:
 * int read()	Tek bir karakteri okumak için kullanılır.
 * void mark(int readAheadLimit)	Mevcut pozisyonu bir akışta işaretlemek için kullanılır.
 * boolean ready()	Akışın okunmaya hazır olup olmadığını söylemek için kullanılır.
 * boolean markSupported()	Akışın mark () işlemini destekleyip desteklemediğini söylemek için kullanılır.
 * long skip(long n)	Karakteri atlamak için kullanılır.
 * void unread (int c)	Karakteri geri itme arabelleğine kopyalayarak geri itmek için kullanılır.
 * void unread (char[] cbuf)	Bir dizi karakteri geri itme arabelleğine kopyalayarak geri itmek için kullanılır.
 * void reset()	Akışı sıfırlamak için kullanılır.
 * void close()	Akışı kapatmak için kullanılır.
 */
public class App {
    public static void main(String[] args) throws Exception {  
        char ary[] = {'1','-','-','2','-','3','4','-','-','-','5','6'};  
        CharArrayReader reader = new CharArrayReader(ary);   
        PushbackReader push = new PushbackReader(reader);  
        int i;  
            while( (i = push.read())!= -1) {  
                if(i == '-') {  
                    int j;  
                    if( (j = push.read()) == '-'){  
                         System.out.print("#*");  
                    }else {  
                        push.unread(j); // push back single character  
                        System.out.print((char)i);  
                    }  
                }else {  
                        System.out.print((char)i);  
                }  
           }         
    }  
}
