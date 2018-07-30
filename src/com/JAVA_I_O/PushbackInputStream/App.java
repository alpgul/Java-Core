package com.JAVA_I_O.PushbackInputStream;

import java.io.*;

/*
 * Java PushbackInputStream sınıfı, InputStream'i geçersiz kılar ve 
 * başka bir giriş akışına ekstra işlevsellik sağlar.Okunan ve bir bayt geri iten bir bayt okuyabilir.
 * 
 * Metodlar:
 * int available()	Giriş akışından okunabilecek bayt sayısını döndürmek için kullanılır.
 * int read()	Giriş akışından sonraki veri baytını okumak için kullanılır.
 * boolean markSupported()	Giriş akışı mark() ve reset() yöntemini test etmek için kullanılır.
 * void mark(int readlimit)	Giriş akışındaki mevcut konumu işaretlemek için kullanılır.
 * long skip(long x)	X bayt veriyi atlamak için kullanılır.
 * void unread(int b)	Baytı geri itme arabelleğine kopyalayarak geri itmek için kullanılır.
 * void unread(byte[] b)	Bu, bayt dizisini geri itme arabelleğine kopyalayarak geri itmek için kullanılır.
 * void reset()	Giriş akışını sıfırlamak için kullanılır.
 * void close()	Giriş akışını kapatmak için kullanılır.
 */
public class App {
    public static void main(String[] args)throws Exception{  
          String srg = "1##2#34###12";  
          byte ary[] = srg.getBytes();  
          ByteArrayInputStream array = new ByteArrayInputStream(ary);  
          PushbackInputStream push = new PushbackInputStream(array);  
          int i;        
              while( (i = push.read())!= -1) {  
                  if(i == '#') {  
                      int j;  
                      if( (j = push.read()) == '#'){  
                           System.out.print("**");  
                      }else {  
                          push.unread(j);  
                          System.out.print((char)i);  
                      }  
                  }else {  
                              System.out.print((char)i);  
                  }  
             }        
  }   
}
