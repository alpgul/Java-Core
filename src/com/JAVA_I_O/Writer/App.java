package com.JAVA_I_O.Writer;

import java.io.*;

/*Writer:
 * Karakterlerin dosyalara yazılmasını sağlar.
 * Alt sınıfların çoğu, daha yüksek verimlilik, işlevsellik 
 * veya her ikisini de sağlamak için burada tanımlanan yöntemlerden bazılarını geçersiz kılar.
 * Alanlar:
 * protected Object	lock	Nesne, bu akıştaki işlemleri senkronize etmek için kullanılır.
 * 
 * Kurucular:
 * protected	Writer()	Karekter çıkıs akımı yaratır. Kritik bölümleri kendisi ile eszamanlı olur.
 * protected	Writer(Object lock)	Karekter çıkıs akımı yaratır. Kritik bölümleri parametrede verilen Object ile eszamanlı olur.
 * 
 * Metodlar:
 * Writer	append(char c)	Belirtilen karakteri bu writera ekler.
 * Writer	append(CharSequence csq)	Bu writera belirtilen karakter dizisini ekler
 * Writer	append(CharSequence csq, int start, int end)	Bu writera belirtilen karakter dizisinin bir alt dizisini ekler.
 * abstract void	close()	İlk önce akan veri akımını kapatır.
 * abstract void	flush()	Veri akışı temizler.
 * void	write(char[] cbuf)	Bir dizi karakter yazar .
 * abstract void	write(char[] cbuf, int off, int len)	Bir dizi karakterin bir bölümünü yazar.
 * void	write(int c)	Tek bir karakter yazar.
 * void	write(String str)	Bir string ifade yazar.
 * void	write(String str, int off, int len)	Bir string ifadenin bir bölümünü yazar.
 */
public class App {
        public static void main(String[] args) {  
        try {  
            Writer w = new FileWriter("output.txt");  
            String content = "I love my country";  
            w.write(content);  
            w.close();  
            System.out.println("Done");  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}
