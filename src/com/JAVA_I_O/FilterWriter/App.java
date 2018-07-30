package com.JAVA_I_O.FilterWriter;
import java.io.*;  
/*
 * Java FilterWriter sınıfı, filtrelenmiş karakter akışlarını yazmak için kullanılan soyut bir sınıftır .
 * FilterWriter'in alt sınıfı, bazı yöntemlerini geçersiz kılmalı ve ayrıca ek yöntemler ve alanlar da sağlar.
 * 
 * Metodlar:
 * void	close()	İlk önce akan akımı kapatır.
 * void	flush()	Akışı temizler.
 * void	write(char[] cbuf, int off, int len)	Bir dizi karakterin bir bölümünü yazar .
 * void	write(int c)	Tek bir karakter yazıyor.
 * void	write(String str, int off, int len)	Bir dizenin bir bölümünü yazar .
 */

class CustomFilterWriter extends FilterWriter {  
    CustomFilterWriter(Writer out) {  
        super(out);  
    }  
    public void write(String str) throws IOException {  
        super.write(str.toLowerCase());  
    }  
}  
public class App {  
    public static void main(String[] args) {  
        try {  
            FileWriter fw = new FileWriter("Record.txt");   
            CustomFilterWriter filterWriter = new CustomFilterWriter(fw);             
            filterWriter.write("I LOVE MY COUNTRY");  
            filterWriter.close();  
            FileReader fr = new FileReader("record.txt");  
            BufferedReader bufferedReader = new BufferedReader(fr);  
            int k;  
            while ((k = bufferedReader.read()) != -1) {  
                System.out.print((char) k);  
            }  
            bufferedReader.close();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}  
