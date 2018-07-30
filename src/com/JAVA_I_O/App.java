package com.JAVA_I_O;

import java.io.IOException;

//Java'da bizim için otomatik olarak 3 tane veri-akışı oluşturulmaktadır. Tüm veri-akışları konsol ile eklenmiştir.
/*
1) System.out: standart çıktı veri-akışı

2) System.in: standart giriş veri-akışı

3) System.err: standart hata veri-akışı

OutputStream:Bir java uygulaması hedefe veri yazmak için kullanır.
inputStream:Bir java uygulaması hedeften veri okumak için kullanır.

OutputStream sınıfı Metodları:
1) public void write (int) IOException'ı atar	Mevcut veri çıkış akışına bir bayt yazmak için kullanılır.
2) public void write (byte []) IOException'ı atar	Mevcut veri çıkış akışına bir dizi bayt yazmak için kullanılır.
3) public void flush () IOException'ı atar	mevcut veri çıkış akışını temizler.
4) public void close () IOException'ı atar	Mevcut veri çıkış akışını kapatmak için kullanılır.

InputStream sınıfı Metodları:
1) public abstract int read () IOException'ı atar	Veri giriş akışından sonraki veri baytını okur. Dosyanın sonunda -1 döndürür.
2) public int available () IOException'ı atar	Mevcut veri giriş akışından okunabilen bayt sayısının bir tahminini döndürür.
3) public void close () IOException'ı atar	mevcut veri giriş akışını kapatmak için kullanılır.
*/
public class App {
public static void main(String[] args) {
    System.out.println("simple message");  
System.err.println("error message");
int i=0;
try {
    i = System.in.read();
} catch (IOException e) {
    e.printStackTrace();
}//returns ASCII code of 1st character  
System.out.println((char)i);//will print the character  
}
}
