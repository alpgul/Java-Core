package com.JAVA_I_O.FileWriter;

import java.io.FileWriter;

/*
 * Java FileWriter sınıfı, bir dosyaya karakter odaklı veri yazmak için kullanılır
 * 
 * Kurucular:
 * FileWriter(String file)	Yeni bir dosya oluşturur. file dosya adı alır .
 * FileWriter(File file)	Yeni bir dosya oluşturur. File nesnesinden dosya adı alır .
 * 
 * Metodlar:
 * void write(String text)	FileWriter içine String yazmak için kullanılır.
 * void write(char c)	Char'ı FileWriter'e yazmak için kullanılır.
 * void write(char[] c)	FileWriter'e char dizisi yazmak için kullanılır.
 * void flush()	FileWriter verilerini temizlemek için kullanılır.
 * void close()	FileWriter'i kapatmak için kullanılır.
 */
public class App {
     public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("D:\\testout.txt");    
           fw.write("Welcome to javaTpoint.");    
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     }    
}
