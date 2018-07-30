package com.JAVA_I_O.FilterInputStream;

import java.io.*;

/*FilterInputStream:
 *  FilterInputStream sınıfı, tüm çıktıları temeldeki çıktı akışına ileten sürümlerle birlikte 
 * tüm InputStream yöntemlerini geçersiz kılar.
Metodları:
int available()	Giriş akışından okunabilecek tahmini bir bayt sayısını döndürmek için kullanılır.
int read()	Giriş akışından sonraki veri baytını okumak için kullanılır.
int read(byte[] b)	Giriş akışından gelen byte.length baytlık veriyi okumak için kullanılır.
long skip(long n)	Giriş akışından n byte veri atlamak için kullanılır.
boolean markSupported()	Giriş akışı mark() methodu ve reset() yöntemini test etmek için kullanılır.
void mark(int readlimit)	Giriş akışındaki mevcut konumu işaretlemek için kullanılır.
void reset()	Giriş akışını sıfırlamak için kullanılır.
void close()	Giriş akışını kapatmak için kullanılır.
 */
public class App {
     public static void main(String[] args) throws IOException {  
        File data = new File("D:\\testout.txt");  
        FileInputStream  file = new FileInputStream(data);  
        FilterInputStream filter = new BufferedInputStream(file);  
        int k =0;  
        while((k=filter.read())!=-1){  
            System.out.print((char)k);  
        }  
        file.close();  
        filter.close();  
    }
}
