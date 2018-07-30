package com.JAVA_I_O.InputStreamReader;

import java.io.*;

/*
 * Bir InputStreamReader, bayt akışlarından karakter akışlarına bir köprüdür: 
 * Baytları okur ve belirtilen bir karakter kümesini kullanarak bunları karakterlere döndürür
 * 
 * Kurucular:
 * InputStreamReader(InputStream in)	Varsayılan karakter kümesini kullanan bir InputStreamReader oluşturur.
 * InputStreamReader(InputStream in, Charset cs)	Verilen karakter kümesini kullanan bir InputStreamReader oluşturur.
 * InputStreamReader(InputStream in, CharsetDecoder dec)	Verilen charset kod çözücüsünü kullanan bir InputStreamReader oluşturur.
 * InputStreamReader(InputStream in, String charsetName)	Adlandırılmış karakter kümesini kullanan bir InputStreamReader oluşturur.
 * 
 * Metodlar:
 * void	close()	Akışı kapatır ve onunla ilişkili tüm sistem kaynaklarını serbest bırakır.
 * String	getEncoding()	Bu akış tarafından kullanılan karakter kodlamasının adını döndürür.
 * int	read()	Tek bir karakter okur.
 * int	read(char[] cbuf, int offset, int length)	Bir dizinin bir kısmına karakterleri okur .
 * boolean	ready()	Bu akışın okunmaya hazır olup olmadığını söyler.
 */
public class App {
     public static void main(String[] args) {  
        try  {  
            InputStream stream = new FileInputStream("file.txt");  
            Reader reader = new InputStreamReader(stream);  
            int data = reader.read();  
            while (data != -1) {  
                System.out.print((char) data);  
                data = reader.read();  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
}
