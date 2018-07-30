package com.JAVA_I_O.ByteArrayOutputStream;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Java ByteArrayOutputStream Sınıfı:
 * Ortak veriyi birden çok dosyaya yazmak için Java ByteArrayOutputStream sınıfı kullanılır . 
 * Bu akışta, veriler daha sonra birden çok akışa yazılabilen bir bayt dizisine yazılır.
 * ByteArrayOutputStream bir veri kopyasını tutar ve onu birden çok akışa iletir.
 * ByteArrayOutputStream arabelleği, verilere göre otomatik olarak büyür.
 * 
 * Kurucular:
 * ByteArrayOutputStream()	 32 baytlık başlangıç ​​kapasitesine sahip yeni bir bayt dizisi çıktı akışı oluşturur .
 * ByteArrayOutputStream(int size) Belirtilen boyutta bir arabellek kapasitesi olan bayt cinsinden yeni bir bayt dizisi çıktı akışı oluşturur.
 * Metotlar:
 * int size()	mevcut boyutunu döndürmek için kullanılır.
 * byte[] toByteArray()	Yeni bir bayt dizisi oluşturmak için kullanılır.
 * String toString()	Platformun varsayılan karakter setini kullanarak arabelleğin içeriğini bir dize bytenı string ifadeye dönüştürür
 * String toString(String charsetName)	charsetName karakter setine göre arabellekteki dize byteni string ifadeye dönüştürür.
 * void write(int b)	Bayt dizisi çıktı akışına belirtilen byte'ın yazılması için kullanılır.
 * void write(byte[] b, int off, int len)	b byte dizisinin off ile belirtilen ofsetinden başlayarak len miktar byte yazar.
 * void writeTo(OutputStream out)		Bir bayt dizisi çıktı akışının argumentteki çıktı akışına yazmak için kullanılır.
 * void reset()	Byte dizisini sıfırlamak için kullanılır
 * void close() ByteArrayOutputStream  nesnesini kapatmak için kullanılır
 */
public class App {
    public static void main(String[] args) throws IOException {
        //Java ByteArrayOutputStream örneği
          FileOutputStream fout1=new FileOutputStream("D:\\f1.txt");    
      FileOutputStream fout2=new FileOutputStream("D:\\f2.txt");    
        
      ByteArrayOutputStream bout=new ByteArrayOutputStream();    
      bout.write(65);    
      bout.writeTo(fout1);    
      bout.writeTo(fout2);    
      //bout.reset();//belleği temizle
      bout.flush();    //belleği temizle ve bellekteki veriyi hdd yaz
      bout.close();//has no effect    
      System.out.println("Success...");    
    }
}
