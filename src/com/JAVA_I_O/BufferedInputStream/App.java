package com.JAVA_I_O.BufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/* Java BufferedInputStream sınıfı:
 * Java BufferedInputStream sınıfı , akıştan bilgi okumak için kullanılır .
 * Performansı hızlı bir şekilde yapmak için dahili olarak tampon mekanizması kullanır.
Kurucular:
BufferedInputStream (InputStream IS)	BufferedInputStream'i oluşturur ve daha sonra kullanmak için giriş argümanını IS kaydeder.
BufferedInputStream (InputStream IS, int boyutu)	BufferedInputStream, belirtilen bir arabellek boyutuyla oluşturur ve daha sonra kullanmak için giriş akışı IS değerini kaydeder.

BufferedInputStream Metodları:
int available()	Giriş akışı için bir sonraki çağrı yöntemi tarafından engellenmeden, girdi akışından okunabilen tahmini bir bayt sayısı verir.
int read()	Giriş akışından sonraki veri baytını okuyor.
int read(byte[] b, int off, int ln)	Belirtilen bayt-giriş akışından belirtilen bayt dizisine, belirtilen ofset ile başlayan baytları okur
void close()	Veri giriş akışını kapatır ve akışla ilişkili sistem kaynaklarından herhangi birini serbest bırakır.
void reset()	Akışı, bu girdi akışında mark metodunun en son çağrıldığı bir konumda yeniden konumlandırır
void mark(int readlimit)	 Giriş akışındaki mevcut konumu işaretler.readlimit ile belirtilen sınırı geçinceye kadar aktiftir.
long skip(long x)	Veri giriş akışından x bayt veriyi atlar
boolean markSupported() mark ve reset metodlarını i destekleyip desteklemediğini test eder
 */
public class App {
    public static void main(String[] args) {
        //Java BufferedInputStream Örneği
        try{    
    FileInputStream fin=new FileInputStream("D:\\testout.txt");    
    BufferedInputStream bin=new BufferedInputStream(fin);    
    int i;    
    while((i=bin.read())!=-1){    
     System.out.print((char)i);    
    }    
    bin.close();    
    fin.close();    
  }catch(Exception e){System.out.println(e);}    
 
    }
}
