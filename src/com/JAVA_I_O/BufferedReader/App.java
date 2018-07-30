package com.JAVA_I_O.BufferedReader;

import java.io.*;

/*
 * Java BufferedReader sınıfı, karaktere dayalı bir giriş akışından metni okumak için kullanılır. 
 * Data satırı readLine () yöntemi ile satır okumak için kullanılabilir. 
 * Performansı hızlı yapar. Reader sınıfını devralır .
 * 
 * Kurucular:
 * BufferedReader(Reader rd)	Bir giriş tamponu için varsayılan boyutu kullanan bir tamponlanmış karakter giriş akışı oluşturmak için kullanılır.
 * BufferedReader(Reader rd, int size)	Bir giriş tamponu için belirtilen boyutu kullanan bir tamponlanmış karakter giriş akışı oluşturmak için kullanılır.
 * 
 * Metodlar:
 * int read()	Tek bir karakteri okumak için kullanılır.
 * int read(char[] cbuf, int off, int len)	Bir dizinin bir kısmına karakterleri okumak için kullanılır .
 * boolean markSupported()	mark ve reset yöntemi için giriş akışı desteğini test etmek için kullanılır.
 * String readLine()	Bir metin satırını okumak için kullanılır.
 * boolean ready()	Giriş akışının okunmaya hazır olup olmadığını test etmek için kullanılır.
 * long skip(long n)	Karakterleri atlamak için kullanılır.
 * void reset()	Akışı , bu girdi akışında işaret yönteminin en son çağrıldığı bir konumda yeniden konumlandırır .
 * void mark(int readAheadLimit)	Mevcut pozisyonu bir akışta işaretlemek için kullanılır.
 * void close()	Giriş akışını kapatır ve akışla ilişkili sistem kaynaklarından herhangi birini serbest bırakır.
 */
public class App {
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("D:\\testout.txt");    
          BufferedReader br=new BufferedReader(fr);    
  
          int i;    
          while((i=br.read())!=-1){  
          System.out.print((char)i);  
          }  
          br.close();    
          fr.close();    
          
          //InputStreamReader ve BufferedReader tarafından konsoldan veri okuma
          InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader br1=new BufferedReader(r);            
    System.out.println("Enter your name");    
    String name=br1.readLine();    
    System.out.println("Welcome "+name);  
    
    //Kullanıcı Stop yazana kadar konsoldan veri okumaya başka bir örnek
    InputStreamReader r1=new InputStreamReader(System.in);    
     BufferedReader br2=new BufferedReader(r1);           
     String name1="";    
     while(!name1.equals("stop")){    
      System.out.println("Enter data: ");    
      name1=br2.readLine();    
      System.out.println("data is: "+name1);    
     }              
    br2.close();    
    r1.close();    
    
    }    
}

