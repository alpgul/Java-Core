package com.JAVA_I_O.StringWriter;

import java.io.*;

/*
 * Java StringWriter sınıfı, bir dize oluşturmak için kullanılabilen dizgi arabelleğinden çıktı toplayan bir karakter dizisidir .
 *  StringWriter sınıfı, Writer sınıfını miras alır .
 * StringWriter sınıfında, ağ soketleri ve dosyaları gibi sistem kaynakları kullanılmaz
 * Dolayısıyla StringWriter'in kapatılması gerekli değildir.
 * 
 * Metodları:
 * void write(int c)	Tek karakteri yazmak için kullanılır.
 * void write(String str)	Dize yazmak için kullanılır.
 * void write(String str, int off, int len)	Bir dizenin bir kısmını yazmak için kullanılır.
 * void write(char[] cbuf, int off, int len)	Bir dizi karakterin bir kısmını yazmak için kullanılır .
 * String toString()	Tampon akım değerini bir dizi olarak döndürmek için kullanılır.
 * StringBuffer getBuffer()	Dize arabelleğini döndürmek için kullanılır.
 * StringWriter append(char c)	Belirtilen karakteri yazara eklemek için kullanılır.
 * StringWriter append(CharSequence csq)	Belirtilen karakter sırasını yazara eklemek için kullanılır.
 * StringWriter append(CharSequence csq, int start, int end)	Belirtilen karakter dizisinin alt dizinini yazara eklemek için kullanılır.
 * void flush()	Akışı temizlemek için kullanılır.
 * void close()	Akışı kapatmak için kullanılır.
 */
public class App {
       public static void main(String[] args) throws IOException {  
        char[] ary = new char[512];  
        StringWriter writer = new StringWriter();  
        FileInputStream input = null;  
        BufferedReader buffer = null;  
        input = new FileInputStream("D://testout.txt");  
        buffer = new BufferedReader(new InputStreamReader(input, "UTF-8"));  
        int x;  
        while ((x = buffer.read(ary)) != -1) {  
                   writer.write(ary, 0, x);  
        }  
        System.out.println(writer.toString());        
        writer.close();  
        buffer.close();  
    }  
}
