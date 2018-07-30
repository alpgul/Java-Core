package com.JAVA_I_O.FileReader;

import java.io.FileReader;

/*
 * Java FileReader sınıfı, dosyadan verileri okumak için kullanılır. 
 * FileInputStream sınıfı gibi bayt formatında veri döndürür .
 * Java'da dosya işleme için kullanılan karakter odaklı bir sınıftır .
 * 
 * Kurucular:
 * FileReader(String file)	String dosya adı alır . Verilen dosyayı okuma modunda açar. Dosya yoksa, FileNotFoundException'ı atar.
 * FileReader(File file)	Dosya örneğinden dosya adı alır . Verilen dosyayı okuma modunda açar. Dosya yoksa, FileNotFoundException'ı atar.
 * 
 * Metodlar:
 * int read()	ASCII formunda bir karakter döndürmek için kullanılır. Dosyanın sonunda -1 döndürür.
void close()	FileReader sınıfını kapatmak için kullanılır.
 */
public class App {
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("D:\\testout.txt");    
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();    
    }  
}
