package com.JAVA_I_O.FileInputStream;

import java.io.FileInputStream;
/*
 * Java FileInputStream Sınıfı:
 * Java FileInputStream sınıfı bir dosyadan giriş baytları alır.
 * Karakter akışı verilerini de okuyabilirsiniz. 
 * Ancak, karakter akışlarını okumak için FileReader sınıfını kullanmanız önerilir .
 * 
 * Java FileInputStream Metodları:
 * int available()	Giriş akışından okunabilecek tahmini bayt sayısını döndürmek için kullanılır.
 * int read()	Giriş akışından veri baytını okumak için kullanılır.
 * int read(byte[] b)	Giriş akışından en fazla 100 baytlık veriyi okumak için kullanılır .
 * int read(byte[] b, int off, int len)	Len ile belirtilen kadar byte dizisi okur
 * long skip(long x)	Giriş akışından x kadar byte veriyi atlamak için kullanılır
 * FileChannel getChannel()	Dosya giriş akışıyla ilişkili benzersiz FileChannel nesnesini döndürmek için kullanılır.
 * FileDescriptor getFD()		FileDescriptor nesnesini döndürmek için kullanılır .
 * protected void finalize()	close metodunu garantiye alarak çağırmak için file input stream sınıfıa fazla referans olmadığında çağrılır.
 * void close()     Veri akışını kapatmak için kullanılır .
 */
public class App {
public static void main(String[] args) {
    //Java FileInputStream örnek 1
     try{    
            FileInputStream fin=new FileInputStream("D:\\testout.txt");    
            int i=fin.read();  
            System.out.print((char)i);    
  
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
            
         
    //Java FileInputStream örnek 2
     try{    
            FileInputStream fin=new FileInputStream("D:\\testout.txt");    
            int i=0;    
            while((i=fin.read())!=-1){    
             System.out.print((char)i);    
            }    
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
         
}
}