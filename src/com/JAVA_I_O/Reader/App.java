package com.JAVA_I_O.Reader;

import java.io.*;

/*
 * Reader:
 * Java Reader, karakter akışlarını okumak için soyut bir sınıftır . 
 * Bununla birlikte, çoğu alt sınıf, daha yüksek verimlilik, ek işlevler veya her ikisini de sağlamak için bazı yöntemleri geçersiz kılar .
 * 
 * Alanlar:protected Object	lock	Nesne, bu akıştaki işlemleri senkronize etmek için kullanılır.
 * 
 * Kurucular
 * protected	Reader()	Kritik bölümleri okuyucu üzerinde senkronize olacak yeni bir karakter akışı okuyucu oluşturur.
 * protected	Reader(Object lock)	Kritik bölümleri belirli bir nesne üzerinde senkronize edilecek yeni bir karakter akışı okuyucu oluşturur.
 * 
 * Metodlar:
 * abstract void	close()	Akışı kapatır ve onunla ilişkili tüm sistem kaynaklarını serbest bırakır.
 * void	mark(int readAheadLimit)	Akımdaki mevcut pozisyonu işaretler.readAheadLimit süresince
 * boolean	markSupported()	Bu mark() işlemini destekleyip desteklemediğini belirtir.
 * int	read()	Tek bir karakter okur.
 * int	read(char[] cbuf)	Karakterleri bir diziye okur .
 * abstract int	read(char[] cbuf, int off, int len)	Bir dizinin bir kısmına karakterleri okur.
 * int	read(CharBuffer target)	Karakterleri belirtilen karakter tamponuna okumayı dener.
 * boolean	ready()	Bu akışın okunmaya hazır olup olmadığını söyler.
 * void	reset()	Akışı sıfırlar.
 * long	skip(long n)	Karakterleri atlar.
 */
public class App {
    public static void main(String[] args) {  
        try {  
            Reader reader = new FileReader("file.txt");  
            int data = reader.read();  
            while (data != -1) {  
                System.out.print((char) data);  
                data = reader.read();  
            }  
            reader.close();  
        } catch (Exception ex) {  
            System.out.println(ex.getMessage());  
        }  
    } 
}
