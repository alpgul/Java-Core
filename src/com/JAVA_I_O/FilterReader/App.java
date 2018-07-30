package com.JAVA_I_O.FilterReader;
import java.io.*;  
/*
 * Java FilterReader, okuyucu akışı üzerinde filtreleme işlemini gerçekleştirmek için kullanılır .
 *  Filtre uygulanmış karakter akışlarını okumak için soyut bir sınıftır.
 * FilterReader, içerdiği akışa tüm istekleri ileten varsayılan yöntemler sağlar. 
 * FilterReader'ın alt sınıfları, bazı yöntemlerini geçersiz kılmalı ve ayrıca ek yöntemler ve alanlar da sunabilir.
 * 
 * Metodlar:
 * void	close()	Akışı kapatır ve onunla ilişkili tüm sistem kaynaklarını serbest bırakır.
 * void	mark(int readAheadLimit)	Akımdaki mevcut pozisyonu işaretler.
 * boolean	markSupported()	Bu akımın mark () işlemini destekleyip desteklemediğini belirtir.
 * boolean	ready()	Bu akışın okunmaya hazır olup olmadığını söyler.
 * int	read()	Tek bir karakter okur.
 * int	read(char[] cbuf, int off, int len)	Bir dizinin bir kısmına karakterleri okur .
 * void	reset()	Akışı sıfırlar.
 * long	skip(long n)	Karakterleri atlar.
 */

class CustomFilterReader extends FilterReader {  
    CustomFilterReader(Reader in) {  
        super(in);  
    }  
    public int read() throws IOException {  
        int x = super.read();  
        if ((char) x == ' ')  
            return ((int) '?');  
        else  
            return x;  
    }  
}  
public class App {  
    public static void main(String[] args) {  
        try  {  
            Reader reader = new FileReader("javaFile123.txt");  
            CustomFilterReader fr = new CustomFilterReader(reader);  
            int i;  
            while ((i = fr.read()) != -1) {  
                System.out.print((char) i);  
            }  
            fr.close();  
            reader.close();  
        } catch (Exception e) {  
            e.getMessage();  
        }  
    }  
}